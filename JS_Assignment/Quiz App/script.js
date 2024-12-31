//References
let timeLeft = document.querySelector(".time-left");
let quizContainer = document.getElementById("container");
let nextBtn = document.getElementById("next-button");
let countOfQuestion = document.querySelector(".number-of-question");
let displayContainer = document.getElementById("display-container");
let scoreContainer = document.querySelector(".score-container");
let restart = document.getElementById("restart");
let userScore = document.getElementById("user-score");
let startScreen = document.querySelector(".start-screen");
let startButton = document.getElementById("start-button");
let questionCount;
let scoreCount = 0;
let count = 11;
let countdown;

//Questions and Options array

const quizArray = [
	{
		id: "0",
		question: "In CSS, what property is used to set the background color?",
		options: ["Color", "bgcolor", "background-color", "background-image"],
		correct: "background-color"
	},
	{
		id: "1",
		question: "CSS property is shorthand for which five properties?",
		options: [
			"border-image-size, border-image-height, border-image-width, border-image-file, border-image-slice",
			"border-image-color, border-image-height, border-image-width, border-image-file,border-image-offset",
			"border-image-style, border-image-range,border-image-width, border-image-resize, border-image-end",
			"border-image-outset,border-image-repeat,border-image-slice, border-image-source, border-image-width"
		],
		correct:
			"border-image-outset, border-image-repeat, border-image-slice, border-image-source, border-image-width"
	},
	{
		id: "2",
		question: "Who invented Computer?",
		options: ["Charles Babbage", "Henry Luce", "Henry Babbage", "Charles Luce"],
		correct: "Charles Babbage"
	},
	{
		id: "3",
		question:
			"What do you call a computer on a network that requests files from another computer?",
		options: ["A client", "A host", "A router", "A web server"],
		correct: "A client"
	},
	{
		id: "4",
		question:
			"Hardware devices that are not part of the main computer system and are often added later to the system.",
		options: ["Peripheral", "Clip art", "Highlight", "Execute"],
		correct: "Peripheral"
	},
	{
		id: "5",
		question:
			"The main computer that stores the files that can be sent to computers that are networked together is:",
		options: ["Clip art", "Mother board", "Peripheral", "File server"],
		correct: "File server"
	},
	{
		id: "6",
		question: "How can you catch a computer virus?",
		options: [
			"Sending e-mail messages",
			"Using a laptop during the winter",
			"Opening e-mail attachments",
			"Shopping on-line"
		],
		correct: "Opening e-mail attachments"
	},
	{
		id: "7",
		question: "What is the HTML <code>data-*</code> global attribute used for?",
		options: [
			"Sending submitted form content to a database",
			"Formatting user input as tabular data",
			"Storing extra information that is not part of standard HTML attributes",
			"Accepting a file upload in a standard data format (.csv, .xls, .tsv, etc.)"
		],
		correct:
			"Storing extra information that is not part of standard HTML attributes"
	},
	{
		id: "8",
		question: "Which is not an Internet protocol?",
		options: ["HTTP", "FTP", "STP", "IP"],
		correct: "STP"
	},
	{
		id: "9",
		question:
			"True or False: In JavaScript, the <code>forEach()</code> method can modify the array it's iterating over.",
		options: ["True", "False"],
		correct: "False"
	},
	{
		id: "10",
		question: "What does 'DOM' stand for?",
		options: [
			"Document Object Model",
			"Data Object Management",
			"Digital Object Module",
			"Document Output Method"
		],
		correct: "Document Object Model"
	}
];

//Restart Quiz
restart.addEventListener("click", () => {
	initial();
	displayContainer.classList.remove("hide");
	scoreContainer.classList.add("hide");
});

//Next Button
nextBtn.addEventListener(
	"click",
	(displayNext = () => {
		//increment questionCount
		questionCount += 1;
		//if last question
		if (questionCount == quizArray.length) {
			//hide question container and display score
			displayContainer.classList.add("hide");
			scoreContainer.classList.remove("hide");
			//user score
			userScore.innerHTML =
				"Your score is " + scoreCount + " out of " + questionCount;
		} else {
			//display questionCount
			countOfQuestion.innerHTML =
				questionCount + 1 + " of " + quizArray.length + " Question";
			//display quiz
			quizDisplay(questionCount);
			count = 11;
			clearInterval(countdown);
			timerDisplay();
		}
	})
);

//Timer
const timerDisplay = () => {
	countdown = setInterval(() => {
		count--;
		timeLeft.innerHTML = `${count}s`;
		if (count == 0) {
			clearInterval(countdown);
			displayNext();
		}
	}, 1000);
};

//Display quiz
const quizDisplay = (questionCount) => {
	let quizCards = document.querySelectorAll(".container-mid");
	//Hide other cards
	quizCards.forEach((card) => {
		card.classList.add("hide");
	});
	//display current question card
	quizCards[questionCount].classList.remove("hide");
};

//Quiz Creation
function quizCreator() {
	//randomly sort questions
	quizArray.sort(() => Math.random() - 0.5);
	//generate quiz
	for (let i of quizArray) {
		//randomly sort options
		i.options.sort(() => Math.random() - 0.5);
		//quiz card creation
		let div = document.createElement("div");
		div.classList.add("container-mid", "hide");
		//question number
		countOfQuestion.innerHTML = 1 + " of " + quizArray.length + " Question";
		//question
		let question_DIV = document.createElement("p");
		question_DIV.classList.add("question");
		question_DIV.innerHTML = i.question;
		div.appendChild(question_DIV);
		//options
		div.innerHTML += `
    <button class="option-div" onclick="checker(this)">${i.options[0]}</button>
     <button class="option-div" onclick="checker(this)">${i.options[1]}</button>
      <button class="option-div" onclick="checker(this)">${i.options[2]}</button>
       <button class="option-div" onclick="checker(this)">${i.options[3]}</button>
    `;
		quizContainer.appendChild(div);
	}
}

//Checker Function to check if option is correct or not
function checker(userOption) {
	let userSolution = userOption.innerText;
	let question = document.getElementsByClassName("container-mid")[questionCount];
	let options = question.querySelectorAll(".option-div");

	//if user clicked answer == correct option stored in object
	if (userSolution === quizArray[questionCount].correct) {
		userOption.classList.add("correct");
		scoreCount++;
	} else {
		userOption.classList.add("incorrect");
		//For marking the correct option
		options.forEach((element) => {
			if (element.innerText == quizArray[questionCount].correct) {
				element.classList.add("correct");
			}
		});
	}

	//clear interval(stop timer)
	clearInterval(countdown);
	//disable all options
	options.forEach((element) => {
		element.disabled = true;
	});
}

//initial setup
function initial() {
	quizContainer.innerHTML = "";
	questionCount = 0;
	scoreCount = 0;
	count = 11;
	clearInterval(countdown);
	timerDisplay();
	quizCreator();
	quizDisplay(questionCount);
}

//when user click on start button
startButton.addEventListener("click", () => {
	startScreen.classList.add("hide");
	displayContainer.classList.remove("hide");
	initial();
});

//hide quiz and display start screen
window.onload = () => {
	startScreen.classList.remove("hide");
	displayContainer.classList.add("hide");
};

// Answers:
// 1: background-color
// 2: border-image-outset, border-image-repeat, border-image-slice, border-image-source, border-image-width
// 3: Storing extra information that is not part of standard HTML attributes
// 4: False
// 5: Document Object Model
