import React, {useState} from 'react';
import './style.css';
import styles from './BoxGenerator.module.css';

const BoxGenerator = props => {
    const [box, setBox] = useState([]);

    const handleSubmit = (e) => {
        e.preventDefault();
        const newBoxArray = box.slice();
        newBoxArray.push({
            background: e.target.color.value,
            // height: (e.target.height.value),
            // width: (e.target.width.value)
        });

        setBox(newBoxArray);
        e.target.color.value = "";
        // e.target.height.value = "";
        // e.target.width.value = "";
    }

    return(
        <>
            <form onSubmit= {handleSubmit}>
                <h2> Enter Box Color </h2>
                <input type="text" name="color" id="color" placeholder="Color"/>
                <button> Add </button>
            </form>
            <div>
                {
                    box.map( (current, index) =>
                        <div
                            key={index}
                            className={styles.box}
                            style={{...current}}
                        />
                    )
                }
            </div>
        </>
    )
}

export default BoxGenerator;