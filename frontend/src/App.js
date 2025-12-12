import React, {useEffect, useState} from 'react';

export default function App(){
  const [msg, setMsg] = useState('Loading...');
  useEffect(()=>{
    fetch('/api/messages')
      .then(r=>r.json())
      .then(d=>setMsg(d.message))
      .catch(e=>setMsg('Error: '+e.message));
  },[]);
  return (
    <div style={{fontFamily:'Arial',padding:20}}>
      <h1>Multi-Service Demo</h1>
      <p>Message from backend: <strong>{msg}</strong></p>
    </div>
  )
}
