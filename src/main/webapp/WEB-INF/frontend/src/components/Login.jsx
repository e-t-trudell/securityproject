import {useState} from 'react';
function Login(){
    const [error, setError] = useState('');
    return(
        <>
            <form action="">
                <div>
                    <input type="text" name="userName"/>
                    <label htmlFor="userName"></label>
                    {error && (
                        <p className="error">{error}</p>
                    )}
                </div>
                <div>
                    <input type="password" name="password"/>
                    <label htmlFor="password"></label>
                    {error && (
                        <p className="error">{error}</p>
                    )}
                </div>
                <div>
                    <input type="password" name="confirmPassword" />
                    <label htmlFor="confirmPassword"></label>
                    {error && (
                        <p className="error">{error}</p>
                    )}
                </div>
            </form>
        </>
    )
}
export default Login;