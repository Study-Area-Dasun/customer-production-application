import React from 'react';
import {
    MDBTable,
    MDBTableHead,
    MDBTableBody,
} from 'mdb-react-ui-kit';

export default function Dashboard() {
    return (
        <>
        <MDBTable>
            <MDBTableHead>
                <tr>
                    <th scope='col'>Name</th>
                    <th scope='col'>Price</th>
                    <th scope='col'>Group ID</th>
                </tr>
            </MDBTableHead>
            <MDBTableBody>
                <tr>
                    <th scope='row'>Default</th>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>

                <tr className='table-primary'>
                    <th scope='row'>Primary</th>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>

            </MDBTableBody>
        </MDBTable>
            </>
    );
}