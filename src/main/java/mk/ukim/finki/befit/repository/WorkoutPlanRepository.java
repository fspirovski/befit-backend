package mk.ukim.finki.befit.repository;

import mk.ukim.finki.befit.model.WorkoutPlan;
import mk.ukim.finki.befit.model.enumeration.BodyPart;
import mk.ukim.finki.befit.model.enumeration.MuscleGroup;
import mk.ukim.finki.befit.model.enumeration.WorkoutType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Long> {
    Page<WorkoutPlan> findAll(Pageable pageable);

    Page<WorkoutPlan> findAllByWorkoutTypeAndEquipmentAndBodyPartAndMuscleGroupsContaining(
            WorkoutType workoutType, Boolean equipment, BodyPart bodyPart, MuscleGroup muscleGroup, Pageable pageable
    );
}
