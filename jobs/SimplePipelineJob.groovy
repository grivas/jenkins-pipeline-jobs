pipelineJob("Simple Pipeline") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        name('master')
                        url('git@bitbucket.org:german_labs/simple-pipeline.git')
                        credentials('bitbucket')
                    }
                    branch('master')
                }
            }
        }
    }
}
