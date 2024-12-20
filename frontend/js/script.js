// Function to validate email format
function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(String(email).toLowerCase());
}

// Function to validate password strength
function validatePassword(password) {
    // Example: Password must be at least 6 characters long
    return password.length >= 6;
}

// Login form validation
document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    let valid = true;

    // Validate email
    if (!validateEmail(email)) {
        valid = false;
        document.getElementById('email').classList.add('is-invalid');
    } else {
        document.getElementById('email').classList.remove('is-invalid');
    }

    // Validate password
    if (password.trim() === '') {
        valid = false;
        document.getElementById('password').classList.add('is-invalid');
    } else {
        document.getElementById('password').classList.remove('is-invalid');
    }

    // If valid, proceed with login (for demo purposes, just redirect)
    if (valid) {
        // Redirect to profile page (you can replace this with actual login logic)
        window.location.href = 'profile.html';
    }
});

// Registration form validation
document.getElementById('registerForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    let valid = true;

    // Validate username
    if (username.trim() === '') {
        valid = false;
        document.getElementById('username').classList.add('is-invalid');
    } else {
        document.getElementById('username').classList.remove('is-invalid');
    }

    // Validate email
    if (!validateEmail(email)) {
        valid = false;
        document.getElementById('email').classList.add('is-invalid');
    } else {
        document.getElementById('email').classList.remove('is-invalid');
    }

    // Validate password
    if (!validatePassword(password)) {
        valid = false;
        document.getElementById('password').classList.add('is-invalid');
    } else {
        document.getElementById('password').classList.remove('is-invalid');
    }

    // If valid, proceed with registration (for demo purposes, just redirect)
    if (valid) {
        // Redirect to profile page (you can replace this with actual registration logic)
        window.location.href = 'profile.html';
    }
});

// Display username on profile page
document.addEventListener('DOMContentLoaded', function() {
    const usernameDisplay = document.getElementById('usernameDisplay');
    // For demo purposes, we'll just set a static username
    usernameDisplay.textContent = 'John Doe'; // Replace with actual username logic
});
