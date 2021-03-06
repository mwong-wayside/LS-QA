package HelpersAndUtilities;

import org.openqa.selenium.WebDriver;
import Objects.Test;

import java.util.*;

public class CommonResources {
    // Site choice
    public static int siteChoiceEntry = 0;

    // Test mode
    public static String qaTestMode = "";

    // Variable for Test objects
    public static String na = "N/A";
    public static String pass = "Pass";
    public static String fail = "Fail";

    // Global Data Types
    public static ArrayList<Test> tests = new ArrayList<>();

    //Files with relative file paths
    public static final String fileWednesday = System.getProperty("user.dir") + "\\images\\wednesday.jpg";
    public static final String fileBadger = System.getProperty("user.dir") + "\\images\\badger.png";

    //Usernames and passwords
    public static final String usernameStudent = "qastudent";
    public static final String passwordStudent = "1234567";

    public static final String usernameTeacher = "qateacher@testing.com";
    public static final String passwordTeacher = "1234567";

    public static final String usernameFail = "helloworld";
    public static final String passwordFail = "helloworld";

    public static final String usernameStudent1 = "qastudent1";
    public static final String passwordStudent1 = "1234567";

    //Browser driver placeholder
    public static WebDriver browserDriver = null;

    //chromedriver.exe and geckodriver.exe file paths
    public static final String chromeDriver = "webdriver.chrome.driver";
    public static final String geckoDriver = "webdriver.gecko.driver";
    public static final String pathFFDriver = "drivers/geckodriver.exe";
    public static final String pathChromeDriver = "drivers/chromedriver.exe";

    //URL
    public static String urlStageLS = "https://stagelearningsite.waysidepublishing.com/";
    public static String urlProdLS = "https://learningsite.waysidepublishing.com/";
    public static String urlDevLS = "https://devlearningsite.waysidepublishing.com/";

    //Login Page CSS classes and selectors
    public static String cssSelectorLogin = "button.Btn_Login";
    public static String cssClassButtonLogin = "Login_Form";
    public static String cssSelectorUsername = "input.ws-input-1:nth-child(1)";
    public static String cssSelectorPassword = "#Main > div.ws-login-container.ws-login-mode-login > " +
            "form.Login_Form.registration-form > div > div:nth-child(2) > input";

    //Dashboard classes and selectors
    public static String cssSelectorPopupSkip = "div.ws-popup-wrapper__footer > div.skip-b > div.icon-link.Btn_Skip";
    public static String cssSelectorNewCourse = ".Btn_Textbooks";
    public static String cssSelectorDashboardCourses = "#Dashboard_Courses";
    public static String cssSelectorViewCourse = "#Dashboard_Courses > div > a.ws-courses-item-title.app-navigation";
    public static String cssSelectorLogout = "a.Btn_User_Logout.app-logout";
    public static String cssLinkTextCourseName = "asd";
    public static String cssSelectorCourse = "div.Dashboard_Courses > div.ws-courses-item >" +
            "a.ws-courses-item-title.app-navigation";
    public static String cssSelectorCourseStudent = "div.Dashboard_Courses > div.ws-courses-item >" +
            "a.ws-courses-item-title.app-navigation";
    public static String courseForAssignmentTest = "asd";
    public static String cssSelectorStartingBanner = "div.ws-ftux__button-tutorial.ws-ftux__button-tutorial--fit-screen";

    //New Course classes, selectors, xpath, and variables
    public static String cssSelectorCourseContent = ".Content";
    public static String cssSelectorCreateCourse = "div.ws-courses-item.create-course";
    public static String cssSelectorFormCreateCourseButton = "form.Create_Course_Form > div.ws-popup-wrapper__footer >" +
            " button.ws-button__positive.Btn_Save_Course";
    public static String cssSelectorFormCreateCourseButtonLoading = cssSelectorFormCreateCourseButton + ".loading";
    public static String cssSelectorCreateCoursePopUp = "form.Create_Course_Form";
    public static String cssSelectorMessageBox = "#Message_Box > div:nth-child(1)";
    public static String cssSelectorCourseTitle = ".content-b > div:nth-child(1) > input:nth-child(2)";
    public static String cssXpathStartDate = "//input[@placeholder='Start date']";
    public static String courseTitle = "Hello World";
    public static String courseCreationDupTitleMsg = "Another teacher has already used this" +
            " course name. Please choose a different course name";
    public static String cssSelectorCurrDay = "table.ui-datepicker-calendar > tbody > tr > td.ui-datepicker-today > a";
    public static String cssSelectorTermsBox = ".content-b > p:nth-child(3) > input:nth-child(2)";
    public static String cssSelectorTitleInput = "form.Create_Course_Form > " +
            "div.ws-popup-content.ws-popup-wrapper__content > div.content-b > div > input";

    //Current course classes, selectors, xpath, and variables
    public static String cssSelectorCogWheel = "//*[@id=\"CourseContent\"]/div[2]/div[1]/div/div[1]/div/a[2]";
    public static String cssXpathAssignmentTab = "//*[@id=\"CourseContent\"]/div[2]/div[1]/div/div[2]/a[3]";
    public static String cssSelectorTrashCan = "div.col.buttons-b > div.ws-btn-2.Btn_Edit_Mode";
    public static String cssSelectorCheckAllBox = "div.checkbox-b > span";
    public static String cssLinkedTextRemove = "Remove selected";
    public static String cssSelectorRemoveConfirm = "div.Btn_Popup_Confirm";
    public static String cssSelectorCourseNav = "div.ws-layout-wrapper >" +
            " div.ws-page-navigation-menu > a.ws-page-navigation-menu-item.app-navigation";

    //Assignment classes, selectors, xpath, and variables
    public static String cssSelectorNoDueDate = "span.ws-checkbox.Checkbox_No_Due_Date";
    public static String cssSelectorAddAssignment = ".Btn_Add_Assignment";
    public static String cssSelectorFolders = "div.ws-course-tree.ws-course-tree__root > div";
    public static String cssSelectorFoldersOpener = "div.ws-course-tree.ws-course-tree__root > div > i.fa.fa-plus-circle.ws-course-tree__plus-icon";
    public static String cssSelectorFoldersCloser = "div.ws-course-tree.ws-course-tree__root > div > i.fa.fa-minus-circle.ws-course-tree__minus-icon";
    public static String cssSelectorFoldersLvl2 = "div.ws-course-tree.ws-course-tree__root > div.ws-course-tree__root.ws-course-tree__root--visible > div.ws-course-tree__node.ws-course-tree__node--has-children.ws-course-tree__node--collapsed";
    public static String cssSelectorFoldersLvl2Opener = "div.ws-course-tree.ws-course-tree__root > div.ws-course-tree__root.ws-course-tree__root--visible > div > i.fa.fa-plus-circle.ws-course-tree__plus-icon";
    public static String cssSelectorFoldersLvl2Closer = "div.ws-course-tree.ws-course-tree__root > div.ws-course-tree__root.ws-course-tree__root--visible > div > i.fa.fa-minus-circle.ws-course-tree__minus-icon";
    public static String cssSelectorX = "div.ws-popup-btn-close:nth-child(2)";
    public static String cssSelectorFoldersLvl3 = "div.ws-course-tree__root.ws-course-tree__root--visible > div.ws-course-tree__root.ws-course-tree__root--visible > div";
    public static String cssSelectorIcons = "i";
    public static String cssSelectorDropContainer = "div.students-assignments-component__selected-objects.ui-droppable";
    public static String cssSelectorFooterButtons = "div.ws-popup__flex__wrapper__footer__actions > div";
    public static String cssSelectorAllCourses = "div.ws-collapsible.select-students-step > div > div";
    public static String cssSelectorCurrCourseCheckBox = "div.ws-collapsible__block__header > span.ws-checkbox";
    public static String cssSelectorAssignmentStudents = "div > div.ws-collapsible__block__content > div > div";
    public static String cssSelectorCurrStudentCheckBox = "div.select-students-step__student__checkbox";
    public static String cssSelectorEditAllStudents = "div.ws-popup__flex__wrapper__content__wrapper > div > div:nth-child(2) > div > div";
    public static String cssSelectorNextNextStep = "div.step-b.active > div.bottom-b >  div.Btn_Next_Step";
    public static String cssSelectorPopupFlexWrapper = "div.ws-popup__flex__wrapper";
    public static String cssSelectorEditNextStep = "div.ws-popup__flex__wrapper__footer__actions > div";
    public static String cssSelectorAssign = "div.step-b.active > div.bottom-b > div.Btn_Assign";
    public static String cssSelectorAssignLoading = "div.step-b.active > div.bottom-b > div.Btn_Assign.loading";
    public static String cssXpathChooseDate = "//input[@placeholder='Choose date']";
    public static String cssSelectorAssignments = "div.Assignments > div.ws-table-wrapper.ws-assignments-table >" +
            " table.ws-table > tbody > tr.ws-table-row";

    public static String cssSelectorAssignmentTitle = "td.title > div > a";
    public static String cssSelectorStudentAssignmentTitle = "td > a";
    public static String cssSelectorStudentCheckBox = "#Popup_Create_Assignment >" +
            " div.ws-assignment-popup-wrapper.Popup_Body > div.ws-popup-content > div.step-b.active >" +
            " div.left-b.full-width > div.content-b > div > div:nth-child(3) > div.ws-user-index > span";

    public static String cssSelectorEdit = "div.ws-table-wrapper.ws-assignments-table > table.ws-table > tbody > " +
            "tr.ws-table-row > td:nth-child(6) > a.icon-link.Btn_Edit_Assignment";

    public static String cssSelectorAssignees = "div.ws-table-wrapper.ws-assignments-table > table.ws-table > tbody >" +
            " tr.ws-table-row > td:nth-child(5) > a";

    public static String cssSelectorSave = "#Popup_Create_Assignment > div.ws-assignment-popup-wrapper.Popup_Body >" +
            " div.ws-popup-content > div.step-b.active > div.bottom-b >" +
            " div.Btn_Save_Assignment.ws-button__positive > div";

    public static String cssSelectorAllAssigned = "#Popup_Content > div.ws-content-popup-wrapper.Popup_Body >" +
            " div.ws-popup-content > div.top-b > div.content-b.Popup_Content > div > div.item-b";

    public static String cssSelectorClose = "#Popup_Content > div.ws-content-popup-wrapper.Popup_Body >" +
            " div.ws-popup-content > div.bottom-b > div.Btn_Close.ws-button__negative";

    public static ArrayList<String> assignedAssignments = new ArrayList<>();
    public static String cssSelectorArchive = "div.ws-table-wrapper.ws-assignments-table > table.ws-table > tbody > " +
            "tr.ws-table-row > td:nth-child(6) > a.icon-link.Btn_Archive_Assignment";

    public static String cssSelectorPopupConfirm = "div#Popup_Confirm";
    public static String cssSelectorArchiveYes = "div.ws-popup-wrapper > div.ws-popup-wrapper__footer > " +
            "div.Btn_Popup_Confirm.ws-button__positive";

    public static String cssSelectorArchiveMessageBox = "div.visible.success";
    public static String archiveSuccessMessage = "Assignment archived";
    public static String cssSelectorShowArchived = "#CourseAssignment > div.ws-page >" +
            " div.ws-page-content.ws-layout-wrapper > " +
            "div.ws-assignments-controls.grid.grid-no-padding.grid-align-middle > div.ws-assignments-filters > " +
            "div.ws-checkbox";

    public static String cssSelectorArchivedAssignments = "#CourseAssignment > div.ws-page >" +
            " div.ws-page-content.ws-layout-wrapper > div.Assignments > div >" +
            " table > tbody > tr.ws-table-row.assignment-archived";
    public static String cssSelectorCreateAssignmentPopup = "#Popup_Create_Assignment >" +
            " div.ws-assignment-popup-wrapper.Popup_Body";
    //FlexText
    public static final String cssSelectorAllFlexText = "div.Content.explorer-flextext-items > div.ws-courses-item >" +
            "div.ws-courses-item-title > a.app-navigation";
    public static final String cssSelectorJumpToPage = "div.tab.wsi-icon-jumptopage";
    public static final String cssSelectorPageInput = "div.content-b > div.tab-content.active >" +
            "div.goto-b > form.Flextext_Goto_Form > input";
    public static final String cssSelectorExplorerImg = "img.explorer-margin";
    public static final String cssSelectorNextPage = "div.btn-next-exhibit";
    public static final String cssSelectorActiveChapter = "a.toc-exhibit-epub-link.active";
    public static final String cssSelectorExplorerLinkBox = "div.popover.relations-block" +
            ".relations-popover.fade.top.in.visible-important";
    public static final String cssSelectorExplorerLink = "div.popover.relations-block.relations-popover.fade.top.in.visible-important > " +
            "div.popover-content.relations-block__content > div.relations-block__list >" +
            " div.relations-block__list-item > a.navigate";
    public static final String cssSelectorSearch = "div.tab.fa.fa-search.TOC_Tab";
    public static final String cssSelectorSearchInput = "div.search-wrapper.empty > input";
    public static final String cssSelectorSearchGo = "div.ws-input-group-2 > button.Flextext_Search_Btn.ws-btn-1";
    public static final String cssSelectorHitCount = "div.hits-stat-b > span.total";
    public static final String cssXpathNoMatch = "//*[contains(text(), 'Sorry, no matches found.')]";
    public static final String cssSelectorSearchResults = "div.tab-content.active > div.search-results-b >" +
            " div.items-b > div.item-b";
    public static final String cssSelectorLoaderIcon = "#CourseAssignment > div.ws-page > " +
            "div.ws-page-content.ws-layout-wrapper > " +
            "div.ws-assignments-controls.grid.grid-no-padding.grid-align-middle > div.ws-assignments-filters > " +
            "div.ws-simple-loader";

    //Content Manager CSS Selectors and Xpaths
    public static final String cssSelectorContentFolders = "div.Course_Toc > ul.jqtree_common.jqtree-tree" +
            " > li.jqtree_common";
    public static final String cssSelectorCurrFolderToggler = "div.jqtree-element.jqtree_common >" +
            " a.jqtree-toggler.jqtree_common.jqtree-toggler-left";
    public static final String cssSelectorNavigationItems = "div.ws-course-content__bottom_wrapper__item >" +
            " div.ws-content-navigation > div.ws-content-navigation-item";
    public static final String cssSelectorSubLinks = "div.ws-content-navigation-item-title >" +
            " div.ws-content-navigation-item-title-bottom > a";
    public static final String cssSelectorAssignmentPopup = "div.ws-popup.ws-popup__flex.students-assignments-component";
    public static final String cssSelectorAssignmentX = "div.ws-popup-btn-close.fa.fa-remove.white";
    public static final String cssSelectorSelectAll = "div.ws-user-index > span.ws-checkbox.Btn_Check_All";
    public static final String cssSelectorActiveStudents = "div.step-b.active > div.bottom-b >" +
            " div.Btn_Next_Step ws-button__positive";
    public static final String cssSelectorQuizTitle = "article > h1";
    public static final String cssSelectorQuizStartButton = "div.ws-btn-1.quiz-component__action.quiz-component__action--green";
    public static final String cssSelectorAssignX = "div.ws-popup__flex__wrapper > div.ws-popup__flex__wrapper__title >" +
            " div.ws-popup-btn-close.fa.fa-remove";
    public static String cssSelectorContentLoadingSaveButton = "#Popup_Create_Assignment > div.ws-assignment-popup-wrapper.Popup_Body >" +
            " div.ws-popup-content > div.step-b.active > div.bottom-b >" +
            " div.Btn_Save_Assignment.ws-button__positive.loading > div";

    //Language Porfolio CSS Selectors and Xpaths
    public static final String cssSelectorProfile = "div.ws-layout-wrapper > a#Btn_Profile";
    public static final String cssSelectorPortfolioButton = "div.ws-page-navigation-menu > a";
    public static final String cssSelectorCanDoStatements = "div.ws-table-wrapper >" +
            " div.Candos > div.Questions_Table_Question";
    public static final String cssSelectorPostAComment = "div.Questions_Table_Question.active > " +
            "div.Questions_Table_Question_Content > div.cando-b > div.Cando_Result > div.message-form-b >" +
            " div.ws-btn-1.Btn_Add_Comment";
    public static final String cssSelectorAllCanDoButtons = "div.Questions_Table_Question_Content > div.cando-b > " +
            "div.Cando_Result > div.message-form-b > form.Create_Message_Form > div.ws-btn-3";
    public static final String cssSelectorAudioRecordingBar = "div.Questions_Table_Question.active >" +
            " div.Questions_Table_Question_Content > div.cando-b > div.Cando_Result > " +
            "div.message-form-b > form.Create_Message_Form > div.Message_Recording_Preview";
    public static final String cssSelectorSaveButton = "div.Questions_Table_Question_Content > div.cando-b > " +
            "div.Cando_Result > div.message-form-b > form.Create_Message_Form > button.Btn_Save_Result.ws-btn-1 >" +
            " div.ws-btn-loader";
    public static final String cssSelectorLoadingSaveButton = "div.Questions_Table_Question_Content > div.cando-b > " +
            "div.Cando_Result > div.message-form-b > form.Create_Message_Form > button.Btn_Save_Result.ws-btn-1.loading >" +
            "div.ws-btn-loader";
    public static final String cssSelectorCommentBox = "div.Questions_Table_Question_Content > div.cando-b > " +
            "div.Cando_Result > div.Comments > div.ws-forum-message-wrapper";
    public static final String cssSelectorCommentBoxAudioRecording = "div.ws-forum-message > div >" +
            " div.ws-forum-message-content > div.ws-forum-message-content-recordings";
    public static final String cssSelectorCommentBoxRemove = "div.ws-forum-message > div >" +
            " div.ws-forum-message-content > div > div.ws-forum-message-content-date > span.link-remove.Btn_Message_Remove";
    public static final String cssSelectorCommentBoxEvidenceRemovedText = "div.no-data-b";
    public static final String cssSelectorVideo = "div.Questions_Table_Question.active >" +
            " div.Questions_Table_Question_Content > div.cando-b > div.Cando_Result >" +
            "div.message-form-b > form.Create_Message_Form > video";
    public static final String cssSelectorCommentBoxVideo = "div.Questions_Table_Question_Content > div.cando-b > " +
            "div.Cando_Result > div.Comments > div.ws-forum-message-wrapper > div.ws-forum-message > div > div.ws-forum-message-content >" +
            "div.ws-forum-message-content-attachments > a";
    public static final String cssSelectorChangeProgressLink = "div.Questions_Table_Question.active >" +
            " div.Questions_Table_Question_Content > div.cando-b > div.Cando_Result > div.cando-grade-b.edit-mode >" +
            " div";
    public static final String cssSelectorProgressResourcesEdit = "div.Questions_Table_Question.active >" +
            " div.Questions_Table_Question_Content > div.cando-b > div.Cando_Result >" +
            " div.cando-grade-b.edit-mode.edit-mode-on > div";
    public static final String cssSelectorProgressResourceEditSaveButton = "div.ws-btn-1.Btn_Update_Grade >" +
            " div.ws-btn-loader";
    public static final String cssSelectorProgressResourceEditLoadingSaveButton = "div.ws-btn-1.Btn_Update_Grade.loading >" +
            " div.ws-btn-loader";
    public static final String cssSelectorTextArea = "div.Questions_Table_Question_Content > div.cando-b > " +
            "div.Cando_Result > div.message-form-b > form.Create_Message_Form > textarea";
    public static final String cssSelectorCommentBoxText = "div.Questions_Table_Question_Content > div.cando-b > " +
            "div.Cando_Result > div.Comments > div.ws-forum-message-wrapper > div.ws-forum-message > div > div.ws-forum-message-content >" +
            "div.ws-forum-message-content-text > span";
    public static final String cssSelectorCommentBoxUploadText = "div.ws-forum-message > div >" +
            " div.ws-forum-message-content > div.ws-forum-message-content-attachments > a";
    public static final String cssSelectorAddQuizAttemptPopupQuizzes = "div.ws-popup-wrapper.medium > " +
            "div.ws-popup-content.ws-popup-wrapper__content.ws-popup-wrapper__content--vertical-center > " +
            "div.Popup_Confirm_Content > div.cando-quiz-b > div.ws-cando-quizes > div.ws-cando-quizes__item > " +
            "div.ws-cando-quizes__item__quiz > span.Quiz_Checkbox.ws-checkbox";
    public static final String cssSelectorAddQuizAttemptPopupProceed = "div.ws-popup-wrapper.medium > " +
            "div.ws-popup-wrapper__footer > div.Btn_Popup_Confirm.ws-button__positive";

    //Profile Settings CSS Selectors and Xpaths
    public static final String cssSelectorAllInputs = "form > div.ws-input-group-1";
    public static final String cssSelectorInputField = "input.ws-input-1";
    public static final String cssSelectorSaveProfileButton = "button.Btn_Save_Profile.ws-btn-1";
    public static final String cssSelectorPasswordErrorMessage = "div.input-error-b";
    public static final String cssSelectorUserBrowserTimezone = "div:nth-child(2) > input";
    public static final String cssSelectorTimezoneSelectField = "div.ws-input-group-1 > select.ws-select-1";
    public static final String cssSelectorProfileImage = "div.Profile_User_Avatar_Img";
    public static final String cssSelectorUploadFileButton = "div.Change_Avatar_Block.active >" +
            " div.Btn_Upload_File.ws-btn-0 > input";
    public static final String cssSelectorRevertToRobohashButton = "div.Btn_Revert_To_Robohash.ws-btn-0 > " +
            "div.ws-btn-loader";
    public static final String cssSelectorChangedProfilePicture = "div.Profile_User_Avatar";

    //Course Settings CSS Selectors
    public static final String cssSelectorSettings= "div.Content > div.ws-course__settings > " +
            "div.ws-course__settings__contents > div.ws-course__settings__contents-item";
    public static final String cssSelectorAssignmentsPenaltyToggle =
            "div.ws-form__input-group-item.ws-form__input-group-item__penalty-toggle > div.onoffswitch > " +
            "label > span.onoffswitch-switch";
    public static final String cssSelectorAssignmentsFormGroups = "form > div.ws-form__input-group";
    public static final String cssSelectorAssignmentsPenaltyInput =
            "div.ws-form__input-group-item.ws-form__input-group-item--short > input";
    public static final String cssSelectorSettingsSaveButton = "div > button";
    public static final String cssSelectorSideNav = "div.ws-course__settings__tabs > " +
            "div.ws-course__settings__tabs-item";
    public static final String cssSelectorQuizSettingsInputGroups = "div.ws-course__settings__contents > " +
            "div.ws-course__settings__contents-item:nth-child(2) > form > div.ws-form__input-group";
    public static final String cssSelectorQuizSettingsHidePassFailToggle =
            "div.ws-form__input-group-item.ws-form__input-group-item__penalty-toggle > div > label.onoffswitch-label > " +
                    "span.onoffswitch-switch";
    public static final String cssSelectorShowHideContent = "div.ws-course__settings__contents > " +
            "div.ws-course__settings__contents-item:nth-child(3) > div.ws-course__settings__show-hide > " +
            "div.ws-course__settings__show-hide__tree > div.ws-course-tree.ws-course-tree__root > " +
            "div.ws-course-tree__node.ws-course-tree__node--has-children";
    public static final String cssSelectorChapterCheckboxCheck = "i.ws-course-tree__icon.fa.fa-check-square-o";
    public static final String cssSelectorChapterCheckboxNoCheck = "i.ws-course-tree__icon.fa.fa-square-o";
    public static final String cssSelectorChapterCheckboxDash = "i.ws-course-tree__icon.fa.fa-minus-square-o";
    public static final String cssSelectorVisibleContent = "div.ws-course-tree__root.ws-course-tree__root--visible > " +
            "div.ws-course-tree__node.ws-course-tree__node--has-children";
    public static final String cssSelectorValueValidator = "div.input-error-b";

    //QuizTests CSS Selectors
    public static final String cssSelectorSimpleTextQuestion = "div.quiz-component__type-simpletext";
    public static final String cssSelectorSimpleTextQuestionInput = "div.quiz-component__question__answer-wrapper > " +
            "div.quiz-component__question__answer-input > input";
    public static final String cssSelectorQuestionTitle = "div.quiz-component__question__title";
    public static final String cssSelectorInputVirtualKeyboard =
            "div.quiz-component__question__diacritics-container.ui-tabs.ui-widget.ui-widget-content.ui-corner-all";
    public static final String cssSelectorClozeQuestion = "div.quiz-component__type-cloze";
    public static final String cssSelectorClozeQuestionInput = "div.quiz-component__question__answer-wrapper > " +
            "div > p > span";
    public static final String cssSelectorInputTag = "input";
    public static final String cssSelectorSelectTag = "select";
    public static final String cssSelectorEssayQuestion = "div.quiz-component__type-essay";
    public static final String cssSelectorEssayInput = "div.quiz-component__question__content > " +
            "div.quiz-component__question__wysiwyg.froala-box > div.froala-wrapper.f-basic > " +
            "div";
    public static final String cssSelectorMultipleChoiceQuestions = "div.quiz-component__type-multichoice";
    public static final String cssSelectorMultipleChoiceQuestionsOptions =
            "div.quiz-component__question__answer-multichoise-wrapper > div.quiz-component__question__answer-multichoise-item > " +
                    "label > span > p";
    public static final String cssSelectorRankQuestion = "div.quiz-component__type-rank";
    public static final String cssSelectorRankQuestionOptions = "div.ui-sortable-handle";
    public static final String cssSelectorrankPlaceholder = "div.quiz-component__question__answer-rank-placeholder";
    public static final String cssSelectorMatchingQuestion = "div.quiz-component__type-matching";
    public static final String cssSelectorMatchingQuestionOptionsLeft =
            "div.quiz-component__question__answer-matching-wrapper > " +
                    "div.quiz-component__question__answer-matching-left > div";
    public static final String cssSelectorMatchingQuestionOptionsRight =
            "div.quiz-component__question__answer-matching-wrapper > " +
                    "div.quiz-component__question__answer-matching-right > div";
    public static final String cssSelectorSVG = "svg";
    public static final String cssSelectorSimpleRecordingQuestion =
            "div.quiz-component__type-simplerecording";
    public static final String cssSelectorSimpleRecordingStartAudioRecordingButton =
            "div.quiz-component__question__answer-simple-recording > div.ws-button__audio > " +
                    "div.ws-button__audio-wrapper > div.ws-button__audio__title.ws-button__audio__title-start";
    public static final String cssSelectorSimpleRecordingStopAudioRecordingButton =
            "div.quiz-component__question__answer-simple-recording > div.ws-button__audio > " +
                    "div.ws-button__audio-wrapper > div.ws-button__audio__title.ws-button__audio__title-stop";
    public static final String cssSelectorSimpleRecordingAudioRecordingBar =
            "div.quiz-component__question__answer-simple-recording > " +
                    "div.quiz-component__question__answer-video-preview-container > audio";
    public static final String cssSelectorSimpleRecordingStartVideoRecordingButton =
            "div.quiz-component__question__answer-simple-recording > div.ws-button__video > " +
                    "div.ws-button__video-wrapper > div.ws-button__video__title.ws-button__video__title-start";
    public static final String cssSelectorSimpleRecordingStopVideoRecordingButton =
            "div.quiz-component__question__answer-simple-recording > div.ws-button__video > " +
                    "div.ws-button__video-wrapper > div.ws-button__video__title.ws-button__video__title-stop";
    public static final String cssSelectorSimplerecordingVideoRecordings =
            "div.quiz-component__question__answer-simple-recording > " +
                    "div.quiz-component__question__answer-video-preview-container > video";
    public static final String cssSelectorComparativeRecordingQuestion =
            "div.quiz-component__type-comparativerecording";
    public static final String cssSelectorComparativeRecordingQuestionAudioStartButton =
            "div.quiz-component__question__answer-comparative-recording > div.ws-button__audio > " +
                    "div.ws-button__audio-wrapper > div.ws-button__audio__title.ws-button__audio__title-start";
    public static final String cssSelectorComparativeRecordingQuestionAudioStopButton =
            "div.quiz-component__question__answer-comparative-recording > div.ws-button__audio > " +
                    "div.ws-button__audio-wrapper > div.ws-button__audio__title.ws-button__audio__title-stop";
    public static final String cssSelectorComparativeRecordingAudioBar =
            "div.quiz-component__question__answer-comparative-recording > " +
                    "div.quiz-component__question__answer-video-preview-container > audio";
    public static final String cssSelectorQuizSubmitButton = "div.ws-btn-1.quiz-component__action.quiz-component__action--yellow";
    public static final String cssSelectorQuizCancelButton = "div.ws-btn-1 quiz-component__action quiz-component__action--red";
    public static final String cssSelectorQuestionsTableQuestions = "div.Questions_Table_Question";
    public static final String cssSelectorQuestionsTableQuestionsFields = "table > tbody > tr > td";
    public static final String cssSelectorSummaryItems = "div.quiz-component__summary__item > " +
            "div.quiz-component__summary__item-icon > i";
    public static final String cssSelectorSummaryTitles = "div.quiz-component__summary__item > " +
            "div.quiz-component__summary__item-title";
    public static final String cssSelectorSummaryItemsChecked = "div.quiz-component__summary__item > " +
            "div.quiz-component__summary__item-icon > i.fa.fa-check-square-o";
    public static final String summaryBoxChecked = "fa fa-check-square-o";
    public static final String saveSpinner = "div.quiz-component__top-loader";


    //Flashcard
    public static final String cssSelectorFlashcard = "div.flashcards-component__card";
    public static final String cssSelectorFlashcardFront = "div.flashcards-component__card-front";
    public static final String cssSelectorFlashcardBack = "div.flashcards-component__card-back";
    public static final String cssSelectorFlashcardFrontContent = "div.flashcards-component__card__content > p > strong";
    public static final String cssSelectorFlashcardNextBtn = "div.flashcards-component__navigation__next-btn";
    public static final String cssSelectorFlashcardPrevBtn = "div.flashcards-component__navigation__prev-btn";
    public static final String cssSelectorSlider = "div.flashcards-component__navigation__slider__handle > span";
    public static final String cssSelectorSliderBar = "div.flashcards-component__navigation__slider";
    public static final String cssSelectorSliderBarInput = "div.flashcards-component__navigation__slider-wrapper > input";
    public static final String cssSelectorLearned = "div.flashcards-component__card-done > div.flashcards-component__card-done__title";
    public static final String cssSelectorFinishedIcon = "div.flashcards-component__all-read__icon";


    //Error Log Names
    public static final String errorLogFlexText = "logs/FlexTextError.txt";

    //Helper methods
    public static ArrayList<String> getIcons(){
        ArrayList<String> icons = new ArrayList<>();
        icons.add("item-icon fa fa-file-text-o");
        icons.add("item-icon fa fa-file-audio-o");
        icons.add("item-icon wsi-icon-quiz");
        icons.add("item-icon fa fa-file-video-o");
        icons.add("item-icon wsi-icon-flashcard");
        icons.add("item-icon fa fa-file-code-o");
        icons.add("item-icon fa fa-comments-o");
        return icons;
    }

    public static ArrayList<String> getIconsCssClass(){
        ArrayList<String> icons = new ArrayList<>();
        icons.add("wsi-icon-file-text-o ws-course-tree__type-icon");
        icons.add("wsi-icon-file-audio-o ws-course-tree__type-icon");
        icons.add("wsi-icon-quiz ws-course-tree__type-icon");
        icons.add("wsi-icon-file-video-o ws-course-tree__type-icon");
        icons.add("wsi-icon-flashcard ws-course-tree__type-icon");
        icons.add("wsi-icon-file-code-o ws-course-tree__type-icon");
        icons.add("wsi-icon-comments-o ws-course-tree__type-icon");
        return icons;
    }

    public static ArrayList<String> getIconsClassContent() {
        ArrayList<String> icons = new ArrayList<>();
        icons.add("ws-content-navigation-item-img fa fa-file-audio-o course-navigation");
        icons.add("ws-content-navigation-item-img fa fa-file-text-o Document_Content_Link");
        icons.add("ws-content-navigation-item-img wsi-icon-quiz course-navigation");
        icons.add("ws-content-navigation-item-img fa fa-comments-o course-navigation");
        icons.add("ws-content-navigation-item-img wsi-icon-flashcard app-navigation");
        icons.add("ws-content-navigation-item-img fa fa-file-video-o course-navigation");
        icons.add("ws-content-navigation-item-img fa fa-file-code-o URL_Content_Link");
        return icons;
    }
    public static ArrayList<String> getAllBooks() {
        ArrayList<String> allBooks = new ArrayList<>();
        allBooks.add("asd");
        allBooks.add("asd1");
        allBooks.add("Triángulo Aprobado (0)");
//        allBooks.add("Azulejo (0)");
//        allBooks.add("Chiarissimo Due (0)");
//        allBooks.add("Chiarissimo Uno (0)");
//        allBooks.add("EntreCulturas (1)");
//        allBooks.add("EntreCulturas (3)");
//        allBooks.add("EntreCulturas 0");
//        allBooks.add("Neue Blickwinkel, 1st Edition");
//        allBooks.add("Neue Blickwinkel, 2nd Edition");
//        allBooks.add("Scandite Muros");
//        allBooks.add("Tejidos (0)");
//        allBooks.add("Triángulo Aprobado (0)");
        return allBooks;
    }

    public static String[] getAllTests(){
        return new String[] {
                "Create Courses",
                "Check Book Selection Count in New Course Page",
                "Assignments",
                "FlexText",
                "Content Manager",
                "Language Portfolio",
                "Profile Settings",
                "Course Settings",
                "Quiz",
                "Flashcards",
                "Footer",
                "Exit program.",
        };
    }

    public static String[] getAllProfileSettingsTests() {
        return new String[] {
                "Edit First Name",
                "Edit Last Name",
                "Edit Password",
                "Edit Email",
                "Edit Timezone",
                "Edit Image"
        };
    }
    public static String[] getAllAssignmentTests(){
        return new String[] {
                "Create all assignments",
                "Create each assignment individually",
                "Confirm assignments for students",
                "Delete assignments",
                "Edit/Assign assignment to new student",
                "Archive assignment",
                "Back",
        };
    }

    public static String[] getAllLanguagePortfolioTests() {
        return new String[] {
                "Check View Button",
                "Check \"ADD QUIZ ATTEMPT\" Button",
                "Check \"ADD RECORDING\" Button",
                "Check \"ADD VIDEO RECORDING\" Button",
                "Check \"Change Progress\" Link",
                "Check Adding Comment",
                "Check File Upload"
        };
    }

    public static String[] getAllContentTests(){
        return new String[] {
                "Check Icon Links",
                "Check View/Assign/Grades/Attempt Links",
                "Check Assigning Assignments From Content",
        };
    }

    public static String[] getAllFlexTextTests(){
        return new String[] {
                "Jump to page",
                "Check Explorer Links",
                "Search",
        };
    }

    public static String[] getAllCourseSettingsTest() {
        return new String[] {
                "Assignments Penalty",
                "Quiz Hide Pass/Fail Status",
                "Quiz Threshold",
                "Quiz Max Attempts",
                "Show/Hide Content"
        };
    }

    public static String[] getSearchWords(){
        return new String[] {
                "pomme",
                "notaword",
                "une",
        };
    }

    public static String[] getAllQuizTests() {
        return new String[] {
                "Check All Quiz Tests",
        };
    }

    public static String[] getAllFlashcardsTests() {
        return new String[] {
                "Check Arrow Keys Nav",
                "Check Arrow Keys Flip",
                "Check Click Flip",
                "Check Arrow UI Nav",
                "Check Slider",
                "Check \"Learned\"",
        };
    }

    public static String[] getAllFooterTests() {
        return new String[] {
                "Contact Us",
                "FAQ",
                "Store",
                "Samples",
                "Visit Wayside",
                "Privacy Policy",
                "Terms and Conditions",
                "Release Notes",
        };
    }

    public static Map<String, String> getIconTypes(){
        Map<String, String> map = new HashMap<>();
        map.put("ws-content-navigation-item-img wsi-icon-quiz course-navigation", "quiz");
        map.put("ws-content-navigation-item-img wsi-icon-flashcard app-navigation", "flashcards");
        return map;
    }

    public static ArrayList<String> getAllCategories(){
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Create Course");
        categories.add("Book Count");
        categories.add("Assignments");
        categories.add("FlexText");
        categories.add("Content Manager");
        categories.add("Language Portfolio");
        categories.add("Profile Settings");
        categories.add("Course Settings");
        categories.add("Quiz Module");
        categories.add("Flashcards");
        categories.add("Footer");
        return categories;
    }
}
