job('simpleTrigger') {
  parameters {
    stringParam('Object', 'Undescribed', 'Some description')
  }
  steps {
    shell('echo $JOB_NAME $BUILD_NUMBER')
    shell('echo $Object')
  }
  publishers {
    downstream('simpleJobWithParameters','SUCCESS')
  }
}
