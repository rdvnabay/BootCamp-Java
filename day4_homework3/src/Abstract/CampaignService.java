package Abstract;

import Entities.Campaign;

public interface CampaignService {
void add(Campaign campaign);
void addMultiple(Campaign[] campaigns);
void delete(Campaign campaign);
void deleteMultiple(Campaign[] campaigns);
void update(Campaign campaign);
void updateMultiple(Campaign[] campaigns);
}