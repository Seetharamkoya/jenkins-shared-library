import hudson.model.Job

def getNextBuildNumber(Job job) {
    return job.getNextBuildNumber()
}