/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package ratatouillerestapp.upc.edu.pe.ui.feed.opensource;

import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.network.model.OpenSourceResponse;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;
import ratatouillerestapp.upc.edu.pe.ui.base.BaseInteractor;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by janisharali on 20/07/17.
 */

public class OpenSourceInteractor extends BaseInteractor
        implements OpenSourceMvpInteractor {

    @Inject
    public OpenSourceInteractor(PreferencesHelper preferencesHelper,
                                ApiHelper apiHelper) {

        super(preferencesHelper, apiHelper);
    }

    @Override
    public Observable<OpenSourceResponse> getOpenSourceApiCall() {
        return getApiHelper().getOpenSourceApiCall();
    }
}
