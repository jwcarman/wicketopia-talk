/*
 * Copyright (c) 2011 Carman Consulting, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wicketopia.example.domain.repository.hibernate;

import org.domdrides.entity.Entity;
import org.domdrides.hibernate.repository.HibernateRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.wicketopia.example.domain.entity.Widget;

import java.io.Serializable;

public class BaseHibernateRepository<EntityType extends Entity<IdType>, IdType extends Serializable> extends HibernateRepository<EntityType,IdType>
{
//----------------------------------------------------------------------------------------------------------------------
// Constructors
//----------------------------------------------------------------------------------------------------------------------

    public BaseHibernateRepository(Class<EntityType> entityClass)
    {
        super(entityClass);
    }

//----------------------------------------------------------------------------------------------------------------------
// Other Methods
//----------------------------------------------------------------------------------------------------------------------

    @Autowired
    public void setDefaultSessionFactory(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
}
