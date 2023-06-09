<style>
/* Start :: Error Page Style */

.number {
  background: #fff;
  position: relative;
  font: 900 30vmin "Consolas";
  letter-spacing: 5vmin;
  text-shadow: 2px -1px 0 #000, 4px -2px 0 #0a0a0a, 6px -3px 0 #0f0f0f, 8px -4px 0 #141414, 10px -5px 0 #1a1a1a, 12px -6px 0 #1f1f1f, 14px -7px 0 #242424, 16px -8px 0 #292929;
}
.number::before {
  background-color: #673ab7;
  background-image: radial-gradient(closest-side at 50% 50%, #ffc107 100%, rgba(0, 0, 0, 0)), radial-gradient(closest-side at 50% 50%, #e91e63 100%, rgba(0, 0, 0, 0));
  background-repeat: repeat-x;
  background-size: 40vmin 40vmin;
  background-position: -100vmin 20vmin, 100vmin -25vmin;
  width: 100%;
  height: 100%;
  mix-blend-mode: screen;
  -webkit-animation: moving 10s linear infinite both;
          animation: moving 10s linear infinite both;
  display: block;
  position: absolute;
  content: "";
}
@-webkit-keyframes moving {
  to {
    background-position: 100vmin 20vmin, -100vmin -25vmin;
  }
}
@keyframes moving {
  to {
    background-position: 100vmin 20vmin, -100vmin -25vmin;
  }
}
.vh-85 {
  height: 85vh!important;
}

/* End :: Error Page Style */
</style>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
 <div class="m-0 p-0">
     <div class="container-fluid vw-100 vh-85 d-flex flex-column justify-content-center align-content-center align-items-center">
		<div class="number">${status_code }</div>
		<div class="text-center h2"><span>Ooops...</span><br>Something went wrong...!</div>
		<div class="text mt-3"><a class="btn btn-sm btn-primary " href="<%= request.getContextPath() %>/index">Go to Home</a></div>
	</div>   
</div>