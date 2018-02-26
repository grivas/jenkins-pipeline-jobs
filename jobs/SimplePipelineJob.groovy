pipelineJob("Simple Pipeline") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        name('master')
                        url('https://github.com/grivas/jenkins-sample-pipeline.git')
                    }
                    branch('master')
                }
            }
        }
    }
}
