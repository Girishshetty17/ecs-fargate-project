package com.ecsproject.notifications.core.services;

import com.ecsproject.notifications.core.dtos.EmailMessage;

public interface NotificationService {

	public void sendEmail(EmailMessage emailMessage);

}
