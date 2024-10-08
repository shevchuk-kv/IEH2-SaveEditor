package org.saveeditor.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

//[1]
public class SaveModel {
    public int version;
    public String lastServerTimeGotServerTime;
    public String lastLocalTimeGotServerTime;
    public String lastTimeLocal;
    public String birthDate;
    public double allTime;
    public double allTimeRealtime;
    public double allTimeWorldAscension;
    public String lastDailyTime;
    @JsonProperty("SEVolume")
    public double sEVolume;
    @JsonProperty("BGMVolume")
    public double bGMVolume;
    public double wasd;
    public double lastCloudSaveTimeForBonus;
    public boolean isCloudSaveOnce;
    public ArrayList<Boolean> isGotAchievements;
    public ArrayList<Boolean> isGotAchievementRewards;
    public ArrayList<Double> achievementPlaytimes;
    public double monsterMilk;
    public ArrayList<Integer> monsterPetRanks;
    public ArrayList<Integer> monsterPetLevels;
    public ArrayList<Double> monsterPetExps;
    public ArrayList<Integer> monsterPetLoyalty;
    public ArrayList<Double> monsterPetLoyaltyExp;
    public ArrayList<Double> monsterPetTamingPoints;
    public ArrayList<Boolean> monsterPetIsActives;
    public double openedChestNum;
    public boolean isInitialized;
    public boolean isVer01010201;
    public boolean isVer01010302;
    public boolean isVer01010402;
    public boolean isVer01010706;
    public boolean isVer01010801;
    public boolean isVer01010803;
    public boolean isVer01010805;
    public boolean isVer01011101;
    public boolean isVer01011112;
    public boolean isVer01011113;
    public boolean isVer01011301;
    public boolean isVer01011401;
    public boolean isVer01011401_2;
    public boolean isVer01011404;
    public boolean isVer01011405;
    public ArrayList<Double> totalMovedDistance;
    public double totalMovedDistancePet;
    public ArrayList<Double> movedDistance;
    public double movedDistancePet;
    public ArrayList<Double> maxHeroLevelReached;
    public ArrayList<Double> physicalTriggeredNum;
    public ArrayList<Double> fireTriggeredNum;
    public ArrayList<Double> iceTriggeredNum;
    public ArrayList<Double> thunderTriggeredNum;
    public ArrayList<Double> lightTriggeredNum;
    public ArrayList<Double> darkTriggeredNum;
    public ArrayList<Integer> persistentSkillSlotNum;
    public int persistentGlobalSkillSlotNum;
    public ArrayList<Boolean> areaIsUnlockedOnceSlime;
    public ArrayList<Boolean> areaIsUnlockedOnceMagicslime;
    public ArrayList<Boolean> areaIsUnlockedOnceSpider;
    public ArrayList<Boolean> areaIsUnlockedOnceBat;
    public ArrayList<Boolean> areaIsUnlockedOnceFairy;
    public ArrayList<Boolean> areaIsUnlockedOnceFox;
    public ArrayList<Boolean> areaIsUnlockedOnceDevilfish;
    public ArrayList<Boolean> areaIsUnlockedOnceTreant;
    public ArrayList<Boolean> areaIsUnlockedOnceFlametiger;
    public ArrayList<Boolean> areaIsUnlockedOnceUnicorn;
    public double portalOrbNum;
    public ArrayList<Boolean> isClearedMission;
    public double lastSwarmPlaytime;
    public double swarmClearedNum;
    public ArrayList<Double> swarmBestScores;
    public ArrayList<Integer> ascensionNum;
    public ArrayList<Double> ascensionPlayTime;
    public ArrayList<Double> ascensionPoints;
    public ArrayList<Double> bestAscensionPlayTime;
    public ArrayList<Double> accomplishedFirstTimeAscension;
    public ArrayList<Double> accomplishedTimeAscension;
    public ArrayList<Double> accomplishedBestTimeAscension;
    public ArrayList<Integer> ascensionMilestoneLevelReached;
    public ArrayList<Boolean> isGotRewardWAAccomplishments;
    public ArrayList<Integer> worldAscensionUpgradeLevels;
    public ArrayList<Double> regularChestRNG;
    public int regularChestRNGUsedIdNum;
    public boolean isReceivedRegularChestToday;
    public double epicCoin;
    public double epicCoinConsumed;
    public ArrayList<Integer> epicStorePurchasedNum;
    public int language;
    public ArrayList<Integer> inAppPurchasedNum;
    public ArrayList<Integer> inAppPurchasedNum_ver01011401;
    public double totalEquipmentGained;
    public ArrayList<Double> disassembledEquipmentNums;
    public ArrayList<Double> townMatGainFromdisassemble;
    public ArrayList<Boolean> equipmentIsGotOnce;
    public ArrayList<Boolean> equipmentIsMaxedWarrior;
    public ArrayList<Boolean> equipmentIsMaxedWizard;
    public ArrayList<Boolean> equipmentIsMaxedAngel;
    public ArrayList<Boolean> equipmentIsMaxedThief;
    public ArrayList<Boolean> equipmentIsMaxedArcher;
    public ArrayList<Boolean> equipmentIsMaxedTamer;
    public ArrayList<Integer> equipmentLoadoutIds;
    public ArrayList<Integer> potionQueues;
    public ArrayList<Boolean> potionIsSuperQueues;
    public ArrayList<Boolean> isStartedExpedition;
    public ArrayList<Double> expeditionProgress;
    public ArrayList<Integer> expeditionTimeId;
    public ArrayList<Double> expeditionMovedDistance;
    public ArrayList<Integer> expeditionPetSpecies;
    public ArrayList<Integer> expeditionPetColors;
    public ArrayList<Boolean> expeditionPetIsSet;
    public ArrayList<Integer> expeditionKinds;
    public ArrayList<Integer> expeditionLevels;
    public ArrayList<Double> expeditionExps;
    public ArrayList<Double> expeditionCompletedNums;
    public ArrayList<Double> expeditionTimes;
    public int maxGuildLevel;
    public double talismanFragement;
    public double totalAlchemyPointGained;
    public boolean isOnAMWA;
    public ArrayList<Boolean> amwaIsEquippedCatalysts;
    public ArrayList<Integer> amwaSavedEssenceWaterPerSecs;
    public ArrayList<Integer> dailyQuestRarities;
    public ArrayList<Integer> dailyQuestMonsterSpecies;
    public ArrayList<Integer> dailyQuestAreaKind;
    public ArrayList<Integer> dailyQuestAreaId;
    public ArrayList<Boolean> isClearedQuestsDaily;
    public ArrayList<Boolean> isAcceptedQuestsDaily;
    public ArrayList<Double> initDefeatedNumQuestsDaily;
    public ArrayList<Double> initCompletedAreaNumQuestsDaily;
    public double totalGeneralQuestClearedNum;
    public ArrayList<Double> totalGeneralQuestClearedNums;
    public ArrayList<Double> maxReachedGeneralQuestClearedNums;
    public ArrayList<Boolean> isFavoriteQuestWarrior;
    public ArrayList<Boolean> isFavoriteQuestWizard;
    public ArrayList<Boolean> isFavoriteQuestAngel;
    public ArrayList<Boolean> isFavoriteQuestThief;
    public ArrayList<Boolean> isFavoriteQuestArcher;
    public ArrayList<Boolean> isFavoriteQuestTamer;
    public ArrayList<Integer> questingAreaKinds;
    public ArrayList<Integer> questingAreaIds;
    public ArrayList<Boolean> questingAreaIsDungeon;
    public boolean isGotFirstEQ;
    public ArrayList<Double> totalRebirthNums;
    public ArrayList<Double> bestRebirthPlaytimes;
    public ArrayList<Boolean> isAutoRebirthOns;
    public ArrayList<Integer> autoRebirthLevels;
    public ArrayList<Double> autoRebirthPoints;
    public ArrayList<Integer> autoRebirthTiers;
    public ArrayList<Integer> favoriteAreaKinds;
    public ArrayList<Integer> favoriteAreaIds;
    public ArrayList<Boolean> isBestExpSecAreas;
    public ArrayList<Boolean> isLazyQuestingMode;
    public ArrayList<Boolean> isAutoAbilityPointPresets;
    public ArrayList<Integer> autoAbilityPointPresetsVIT;
    public ArrayList<Integer> autoAbilityPointPresetsSTR;
    public ArrayList<Integer> autoAbilityPointPresetsINT;
    public ArrayList<Integer> autoAbilityPointPresetsAGI;
    public ArrayList<Integer> autoAbilityPointPresetsLUK;
    public ArrayList<Integer> autoAbilityPointMaxVIT;
    public ArrayList<Integer> autoAbilityPointMaxSTR;
    public ArrayList<Integer> autoAbilityPointMaxINT;
    public ArrayList<Integer> autoAbilityPointMaxAGI;
    public ArrayList<Integer> autoAbilityPointMaxLUK;
    public ArrayList<Double> accomplishedFirstTimesRebirth;
    public ArrayList<Double> accomplishedTimesRebirth;
    public ArrayList<Double> accomplishedBestTimesRebirth;
    public ArrayList<Double> warriorSkillTriggeredNum;
    public ArrayList<Double> wizardSkillTriggeredNum;
    public ArrayList<Double> angelSkillTriggeredNum;
    public ArrayList<Double> thiefSkillTriggeredNum;
    public ArrayList<Double> archerSkillTriggeredNum;
    public ArrayList<Double> tamerSkillTriggeredNum;
    public ArrayList<Integer> skillLoadoutIds;
    public ArrayList<Integer> upgradeQueuesResource;
    public ArrayList<Integer> upgradeQueuesBasicStats;
    public int upgradeQueuesGoldGain;
    public int upgradeQueueExpGain;
    public int upgradeQueuesEquipmentInventory;
    public ArrayList<Integer> upgradeQueuesGoldCap;
    public ArrayList<Integer> upgradeQueuesSlimebank;
    public ArrayList<Boolean> upgradeIsSuperQueuesResource;
    public ArrayList<Boolean> upgradeIsSuperQueuesBasicStats;
    public boolean upgradeIsSuperQueuesGoldGain;
    public boolean upgradeIsSuperQueueExpGain;
    public boolean upgradeIsSuperQueueEquipmentInventory;
    public ArrayList<Boolean> upgradeIsSuperQueuesGoldCap;
    public ArrayList<Boolean> upgradeIsSuperQueuesSlimebank;
    public double nitro;
    public double nitroConsumed;
    public double nitroSpeed;
    public double totalGold;
    public double totalStone;
    public double totalCrystal;
    public double totalLeaf;
    public double totalSlimeCoin;
    public boolean isDlcStarterPack;
    public boolean isDlcNitroPack;
    public boolean isDlcGlobalSkillSlotPack;
    public boolean isDlcInventorySlotPack;
    public int currentHero;
    public ArrayList<Double> playtimes;
    public ArrayList<Double> playtimesRealTime;
    public ArrayList<Long> multibuyNums;
    public boolean isUsedSimulationOnce;
    public boolean isShowQuickAccess;
    public ArrayList<Double> autoAreaProgressionTargetClearNums;
    public ArrayList<Boolean> isReceivedBonusCodes;
    public ArrayList<Boolean> isEnchantFilter;
    public ArrayList<Integer> enchantFilterLevel;
    public boolean isSlotNumEnchantFilter;
    public int slotNumEnchantFilter;
    public int checkedIEH1Achievement;
    public int receivedIEH1Achievement;
    public boolean isReceivedIEH1DLCIEH2SupportPack;
    public ArrayList<Boolean> isScrollFilter;
    public ArrayList<Boolean> isToggleOn;
    public double bgmVolume;
    public double sfxVolume;
    public boolean isFirstWelcomed;
    public int currentTutorialArrow;
}
