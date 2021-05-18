import React, { useState } from  'react';


const UserForm = props => {
    const {inputs, setInputs} = props;
    const [valid, setValid] = useState({
        firstName : false,
        lastName : false,
        email: false,
        password: false,
        confirmPassword: false,
    });
    const [firstName, setfirstName] = useState("");
    const [lastName, setlastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");  


    const onChange = (e) =>{
        setInputs({
            ...inputs,
            [e.target.name]: e.target.value
        });

        if(e.target.name === "password"){
            if(e.target.value.length >= 8){
                setValid({
                    ...valid,
                    [e.target.name]: true
                });
            } 
            else{
                setValid({
                    ...valid,
                    [e.target.name]: false
                });
            }
        } 
        else if(e.target.name === "confirmPassword"){
            if(e.target.value === inputs.password){
                setValid({
                    ...valid,
                    [e.target.name]: true
                });
            } 
            else{
                setValid({
                    ...valid,
                    [e.target.name]: false
                });
            }
        } 
        else{
            if(e.target.value.length >= 2){
                setValid({
                    ...valid,
                    [e.target.name]: true
                });
            } 
            else{
                setValid({
                    ...valid,
                    [e.target.name]: false
                });
            }
        }
    };

    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstName, lastName, email, password };
        console.log("Welcome", newUser);

        };

        return(
            <form onSubmit={ createUser }>
                <div>
                    <label>First Name: </label> 
                    <input type="text" onChange={ (e) => setfirstName(e.target.value) } value = { firstName }/>

                    {inputs.firstName.length > 0? 
                    {
                        valid.firstName ?
                        alert('First Name must be at least 2 characters') :
                    }
                }
                </div>
                <div>
                    <label>Last Name: </label> 
                    <input type="text" onChange={ (e) => setlastName(e.target.value) } value = { lastName } />
                </div>
                <div>
                    <label>Email Address: </label> 
                    <input type="text" onChange={ (e) => setEmail(e.target.value) } value = { email } />
                </div>
                <div>
                    <label>Password: </label>
                    <input type="text" onChange={ (e) => setPassword(e.target.value) } value = { password } />
                </div>
                <div>
                    <label>Confirm Password: </label>
                    <input type="text" onChange={ (e) => setPassword(e.target.value) } value = { confirmPassword } />
                </div>
                <input type="submit" value="Create User" />

            </form>

        

        );

};


export default UserForm;