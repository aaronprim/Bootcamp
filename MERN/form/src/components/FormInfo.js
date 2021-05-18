import React from  'react';

const FormInfo = props => {
    const { firstName, lastName, email, password, confirmPassword } = props.data


    return(
        <div className = {FormInfo}>
            <table>
                <tbody>
                    <tr>
                        <td>First Name:</td>
                        <td>{firstName}</td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td>{lastName}</td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td>{email}</td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td>{password}</td>
                    </tr>
                    <tr>
                        <td>Confirm Password:</td>
                        <td>{confirmPassword}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
};

export default FormInfo;
    

