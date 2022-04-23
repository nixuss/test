#!/bin/groovy

job('job_1') {
  steps {
    shell('echo It is DSL-generated job')
  }
}

