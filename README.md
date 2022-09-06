# CIT-63 JAVA

## This is a template repo that you will make your own. 

# Getting started

## git --version (checks if you have git installed) if you don't get a git version number back you will have to install git
### You can go here and download it according to your OS <a>https://git-scm.com/downloads</a>

# After that you can restart intelliJ and start using git by typing the command:
### git init (This will create an empty repo inside of whatever folder you are on in the terminal)

# We will then use these commands to set up our profile:
### git config --global user.name &#42;YourName&#42; (don't include the &#42;&#42;)
### git config -- gobal user.email &#42;YourEmail&#42; (Use the same email as github)

# Almost There
## We now have to set a destination point for our code
### we will do this by typing:
## git remote add origin &#42;LINKToYourRepo&#42; (You can go to your github repo and copy the link)
## We will add the files in our current path by typing
# git add -A
## With everything set up we just need to commit our current files which will then set up a branch that we will push onto github
# We can do so by typing:
# git commit -m "First commit" (this will then show us the branch it created for us)
### we can see what branch we are on by typing:
## git branch
## Intellij uses master as the default branch which used to be the standard, but now all github reposetories will default to main
### We are going to make our branch main by typing:
## git branch -M main
# Pushing our code
### You will then type:
## git push -u origin main
#### OR
## git push --set-upstream origin main
# After this step a pop-up window should appear asking you to login to github or the terminal will ask you for your login
### this will then process your changes and give you a github link to your repo in the intellij terminal
## If it doesnt push your code you might have to pull/fetch first.
# The last command you can type to fix this issue is:
# git push -f *YourRepoURL* main

# Basic Git commands / Git workflow

### git status (Tells you which files are new or have experienced changes)

### git add -A (this command will add everything so far) or git add * (adds everything in your current folder)

### git commit -m "What changes you have made" (adds a message to your commit)

### git push (pushes the changes to your repo in github)
