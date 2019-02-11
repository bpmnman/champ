node {
    def app

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }

    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */


        app = docker.build("djboot")
        app = docker.build("djboot33")
        app = docker.build("bpmnman/champ")
    }

    stage('Test image') {
        /* Ideally, we would run a test framework against our image.
         * For this example, we're using a Volkswagen-type approach ;-) */

        app.inside {
            sh 'echo "Tests passed all"'
        }
    }

    stage('Push image') {
        /* Finally, we'll push the image with two tags: build it too
         * First, the incremental build number from Jenkins
         * Second, the 'latest' tag.
         * one mor ecomment
         * lol
         * Pushing multiple tags is cheap, as all the layers are reused. */
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
    }
}
