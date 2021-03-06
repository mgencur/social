/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.social.twitter.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.jboss.seam.social.twitter.domain.SearchResult;
import org.jboss.seam.social.twitter.domain.Tweet;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchResultJackson implements SearchResult
{
   private List<Tweet> results;

   @JsonProperty(value = "max_id")
   private long maxId;

   @JsonProperty(value = "since_id")
   private long sinceId;

   /* (non-Javadoc)
    * @see org.jboss.seam.social.twitter.domain.SearchResult#getResults()
    */
   @Override
   public List<Tweet> getResults()
   {
      return results;
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.twitter.domain.SearchResult#setResults(java.util.List)
    */
   @Override
   public void setResults(List<Tweet> results)
   {
      this.results = results;
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.twitter.domain.SearchResult#getMaxId()
    */
   @Override
   public long getMaxId()
   {
      return maxId;
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.twitter.domain.SearchResult#setMaxId(long)
    */
   @Override
   public void setMaxId(long maxId)
   {
      this.maxId = maxId;
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.twitter.domain.SearchResult#getSinceId()
    */
   @Override
   public long getSinceId()
   {
      return sinceId;
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.twitter.domain.SearchResult#setSinceId(long)
    */
   @Override
   public void setSinceId(long sinceId)
   {
      this.sinceId = sinceId;
   }
   
   
}