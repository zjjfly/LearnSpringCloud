#!/usr/bin/env groovy
import hudson.model.*

def err
try {
    node {
        stage '\u2776 Stage 1'
        echo "\u2600 BUILD_URL=${env.BUILD_URL}"

        def workspace = pwd()
        echo "\u2600 workspace=${workspace}"

        stage '\u2777 Stage 2'
    } // node
} // try end
catch (exc) {
    err = exc
} finally {
    if (err) {
        currentBuild.result = 'FAILURE'
    } else {
        currentBuild.result = 'Success'
    }
    emailext attachLog: true, body: "任务执行结果:${currentBuild.result}", compressLog: true,
             subject: "Jenkins任务报告-${currentBuild.fullDisplayName}", to: 'zjjblue@gmail.com'
}