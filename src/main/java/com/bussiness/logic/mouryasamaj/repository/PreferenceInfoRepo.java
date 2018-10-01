package com.bussiness.logic.mouryasamaj.repository;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "prefrance_info")
@Getter
@Setter
public class PreferenceInfoRepo {

  @Id
  private String PrefranceInfoID;
  private Integer prefferedAgeLowerLimit;
  private Integer prefferedHeight;
  private Integer prefferedCandidateBodyType;
  private Integer prefferedAgeUpperLimit;
  private Integer prefferedColorComplexion;
  private Integer prefferedEducationLevel;
  private Integer prefferedDietHabit;
  private Integer prefferedMartialStatus;
  @JsonIgnore
  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "user_id", nullable = false)
  private UserInfoRepo userRepo;

}
