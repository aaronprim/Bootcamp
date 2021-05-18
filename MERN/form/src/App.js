import React, {useState} from 'react';
import './App.css';

import UserForm from './components/UserForm';
import FormInfo from './components/FormInfo'

function App() {

  const [state, setState] = useState({
    firstName: "",
    lastName: "",
    email: "",
    password: "",
    confirmPassword: ""
  });

  return (
    <div className="App">

      <h1> User Form </h1>
      <UserForm inputs={state} setInputs={setState}></UserForm>
      <FormInfo data= {state}></FormInfo>

    </div>

  );
}

export default App;
