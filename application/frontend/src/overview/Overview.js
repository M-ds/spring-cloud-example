import Title from "./Title";
import React from "react";
import axios from "axios";

const baseURL = "http://localhost:9191";

class Overview extends React.Component {

  state = {
    studentWithCourses: []
  }

  async componentDidMount() {
    for (let studentId = 1; studentId < 4; studentId++) {
      let httpResponse = await axios.get(`${baseURL}/student/find/${studentId}`);
      const result = httpResponse.data;
      this.state.studentWithCourses.push(result.studentWithCourses);
    }
    console.log(this.state.studentWithCourses);
  }

  renderTableData() {
    return (
      this.state.studentWithCourses.map(student => (
        <ul>
          <li key={student.student.id}>
            {student.student.firstname}
          </li>
        </ul>

      ))
    )
  }

  render() {
    return (
      <div>
        <Title/>
          {this.renderTableData}
      </div>
    );
  }

}

export default Overview;
