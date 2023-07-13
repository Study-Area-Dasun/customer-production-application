import axios from 'axios';
import React, { useState } from 'react';
import {Routes, Route, useHistory} from 'react-router-dom';
import Dashboard from "./Dashboard";

import {
    MDBBtn,
    MDBContainer,
    MDBCard,
    MDBCardBody,
    MDBCardImage,
    MDBRow,
    MDBCol,
    MDBIcon,
    MDBInput
}
    from 'mdb-react-ui-kit';

function App() {
    const navigate = useHistory();
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');


    function handleEmailChange(e) {
        setEmail(e.target.value);
    }

    function handlePasswordChange(e) {
        setPassword(e.target.value);
    }

    function handleSubmit(e) {
        e.preventDefault();

        // Prepare the data to send in the request body
        console.log(email)
        // Send the POST request
        axios.post('http://localhost:8080/api/v1/customers', {
            "email":email,
            "password":password,
        })
            .then(response => {
                // Handle the response data here
                alert("working")
                console.log(response.data);

                // Navigate to the desired page on successful login
                navigate.push(<Dashboard/>);

            })
            .catch(error => {
                alert("try again");

                console.error(error);
            });
    }
    return (
        <MDBContainer className="my-1 ">

            <MDBCard>
                <MDBRow className='g-0 '>

                    <MDBCol md='4' className='d-flex justify-content-center'>
                        <MDBCardImage src='https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img1.webp' alt="login form" className='rounded-start w-100'/>
                    </MDBCol>

                    <MDBCol md='6'>
                        <MDBCardBody className='d-flex flex-column'>

                            <div className='d-flex flex-row mt-2'>
                                <MDBIcon fas icon="cubes fa-3x me-3" style={{ color: '#ff6219' }}/>
                                <span className="h1 fw-bold mb-0">Customer And Product Application</span>
                            </div>

                            <h5 className="fw-normal my-4 pb-3" style={{letterSpacing: '1px'}}>Sign into your account</h5>
                            <form  onSubmit={handleSubmit}>
                            <MDBInput wrapperClass='mb-4' label='Email address' id='formControlLg' type='email' size="lg"  value={email}
                                      onChange={handleEmailChange}/>
                            <MDBInput wrapperClass='mb-4' label='Password' id='formControlLg' type='password' size="lg" value={password}
                                      onChange={handlePasswordChange}/>



                            <button color='dark !impoertan' size='lg' type="submit" className="btn btn-primary active mb-4 px-7" data-bs-toggle="button"
                                    aria-pressed="true">Login
                            </button>
                            </form>

                            <p className="mb-5 pb-lg-2" style={{color: '#393f81'}}>Don't have an account? <a href="#!" style={{color: '#393f81'}}>Register here</a></p>

                            {/*<div className='d-flex flex-row justify-content-start'>*/}
                            {/*    <a href="#!" className="small text-muted me-1">Terms of use.</a>*/}
                            {/*    <a href="#!" className="small text-muted">Privacy policy</a>*/}
                            {/*</div>*/}

                        </MDBCardBody>
                    </MDBCol>

                </MDBRow>
            </MDBCard>

        </MDBContainer>
    );
}

export default App;


