package ru.eremenko.velociraptor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eremenko.velociraptor.domain.User;
import ru.eremenko.velociraptor.domain.UserSubscription;
import ru.eremenko.velociraptor.domain.UserSubscriptionsId;

import java.util.List;

public interface UserSubscriptionRepo extends JpaRepository<UserSubscription, UserSubscriptionsId> {
    List<UserSubscription> findBySubscriber(User user);
}
