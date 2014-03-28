/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.go.server.scheduling;

import com.thoughtworks.go.server.messaging.GoMessage;

public class ScheduleCheckCompletedMessage implements GoMessage {
    private String pipelineName;
    private long trackingId;

    public ScheduleCheckCompletedMessage(String pipelineName, long trackingId) {
        this.pipelineName = pipelineName;
        this.trackingId = trackingId;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public long trackingId() {
        return trackingId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ScheduleCheckCompletedMessage that = (ScheduleCheckCompletedMessage) o;

        if (pipelineName != null ? !pipelineName.equals(that.pipelineName) : that.pipelineName != null) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        return (pipelineName != null ? pipelineName.hashCode() : 0);
    }
}