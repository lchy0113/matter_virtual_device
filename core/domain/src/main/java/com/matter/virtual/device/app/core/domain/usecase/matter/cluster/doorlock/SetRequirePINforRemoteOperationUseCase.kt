package com.matter.virtual.device.app.core.domain.usecase.matter.cluster.doorlock

import com.matter.virtual.device.app.core.common.di.IoDispatcher
import com.matter.virtual.device.app.core.data.repository.cluster.DoorLockManagerRepository
import com.matter.virtual.device.app.core.domain.CoroutineUseCase
import javax.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher

class SetRequirePINforRemoteOperationUseCase
@Inject
constructor(
  private val doorLockManagerRepository: DoorLockManagerRepository,
  @IoDispatcher dispatcher: CoroutineDispatcher
) : CoroutineUseCase<Boolean, Unit>(dispatcher) {

  override suspend fun execute(param: Boolean) {
    doorLockManagerRepository.setRequirePINforRemoteOperation(param)
  }
}
