package com.gregtechceu.gtceu.data.recipe.chemistry;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.api.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.gregtechceu.gtceu.api.GTValues.*;

public class PolymerRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        polyethyleneProcess(provider);
        polyvinylChlorideProcess(provider);
        ptfeProcess(provider);
        epoxyProcess(provider);
        styreneButadieneProcess(provider);
        polybenzimidazoleProcess(provider);
        polycaprolactamProcess(provider);
    }

    private static void polyethyleneProcess(Consumer<FinishedRecipe> provider) {

        CHEMICAL_RECIPES.recipeBuilder(SulfuricAcid.getName() + "_" + Ethanol.getName())
                .inputFluids(SulfuricAcid.getFluid(1000))
                .inputFluids(Ethanol.getFluid(1000))
                .outputFluids(Ethylene.getFluid(1000))
                .outputFluids(DilutedSulfuricAcid.getFluid(1000))
                .duration(1200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(Glycerol.getName() + "_" + CarbonDioxide.getName())
                .inputFluids(Glycerol.getFluid(1000))
                .inputFluids(CarbonDioxide.getFluid(1000))
                .outputFluids(Ethylene.getFluid(2000))
                .outputFluids(Oxygen.getFluid(5000))
                .duration(400).EUt(200).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(Air.getName() + "_" + Ethylene.getName() + ".1")
                .circuitMeta(1)
                .inputFluids(Air.getFluid(1000))
                .inputFluids(Ethylene.getFluid(144))
                .outputFluids(Polyethylene.getFluid(144))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(Oxygen.getName() + "_" + Ethylene.getName() + ".1")
                .circuitMeta(1)
                .inputFluids(Oxygen.getFluid(1000))
                .inputFluids(Ethylene.getFluid(144))
                .outputFluids(Polyethylene.getFluid(216))
                .duration(160).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(Air.getName() + "_" + Ethylene.getName() + ".3")
                .circuitMeta(3)
                .inputFluids(Air.getFluid(7500))
                .inputFluids(Ethylene.getFluid(2160))
                .inputFluids(TitaniumTetrachloride.getFluid(100))
                .outputFluids(Polyethylene.getFluid(3240))
                .duration(800).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(Oxygen.getName() + "_" + Ethylene.getName() + ".3")
                .circuitMeta(3)
                .inputFluids(Oxygen.getFluid(7500))
                .inputFluids(Ethylene.getFluid(2160))
                .inputFluids(TitaniumTetrachloride.getFluid(100))
                .outputFluids(Polyethylene.getFluid(4320))
                .duration(800).EUt(VA[LV]).save(provider);
    }

    private static void polyvinylChlorideProcess(Consumer<FinishedRecipe> provider) {
        var id = 0;
        CHEMICAL_RECIPES.recipeBuilder("polyvinyl_chloride_" + id++)
                .circuitMeta(3)
                .inputFluids(Oxygen.getFluid(1000))
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .inputFluids(Ethylene.getFluid(1000))
                .outputFluids(Water.getFluid(1000))
                .outputFluids(VinylChloride.getFluid(1000))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polyvinyl_chloride_" + id++)
                .inputFluids(Chlorine.getFluid(2000))
                .inputFluids(Ethylene.getFluid(1000))
                .outputFluids(VinylChloride.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(1000))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polyvinyl_chloride_" + id++)
                .inputFluids(Chlorine.getFluid(4000))
                .inputFluids(Ethane.getFluid(1000))
                .outputFluids(VinylChloride.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(3000))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polyvinyl_chloride_" + id++)
                .circuitMeta(1)
                .inputFluids(Air.getFluid(1000))
                .inputFluids(VinylChloride.getFluid(144))
                .outputFluids(PolyvinylChloride.getFluid(144))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polyvinyl_chloride_" + id++)
                .circuitMeta(1)
                .inputFluids(Oxygen.getFluid(1000))
                .inputFluids(VinylChloride.getFluid(144))
                .outputFluids(PolyvinylChloride.getFluid(216))
                .duration(160).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("polyvinyl_chloride_" + id++)
                .circuitMeta(2)
                .inputFluids(Air.getFluid(7500))
                .inputFluids(VinylChloride.getFluid(2160))
                .inputFluids(TitaniumTetrachloride.getFluid(100))
                .outputFluids(PolyvinylChloride.getFluid(3240))
                .duration(800).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("polyvinyl_chloride_" + id)
                .circuitMeta(2)
                .inputFluids(Oxygen.getFluid(7500))
                .inputFluids(VinylChloride.getFluid(2160))
                .inputFluids(TitaniumTetrachloride.getFluid(100))
                .outputFluids(PolyvinylChloride.getFluid(4320))
                .duration(800).EUt(VA[LV]).save(provider);
    }

    private static void ptfeProcess(Consumer<FinishedRecipe> provider) {
        var id = 0;
        CHEMICAL_RECIPES.recipeBuilder("ptfe_" + id++)
                .circuitMeta(1)
                .inputFluids(Chlorine.getFluid(6000))
                .inputFluids(Methane.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(3000))
                .outputFluids(Chloroform.getFluid(1000))
                .duration(80).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("ptfe_" + id++)
                .inputFluids(Chloroform.getFluid(2000))
                .inputFluids(HydrofluoricAcid.getFluid(4000))
                .outputFluids(HydrochloricAcid.getFluid(6000))
                .outputFluids(Tetrafluoroethylene.getFluid(1000))
                .duration(480).EUt(240).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("ptfe_" + id++)
                .circuitMeta(24)
                .inputFluids(HydrofluoricAcid.getFluid(4000))
                .inputFluids(Methane.getFluid(2000))
                .inputFluids(Chlorine.getFluid(12000))
                .outputFluids(Tetrafluoroethylene.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(12000))
                .duration(540).EUt(VA[IV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("ptfe_" + id++)
                .circuitMeta(1)
                .inputFluids(Air.getFluid(1000))
                .inputFluids(Tetrafluoroethylene.getFluid(144))
                .outputFluids(Polytetrafluoroethylene.getFluid(144))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("ptfe_" + id++)
                .circuitMeta(1)
                .inputFluids(Oxygen.getFluid(1000))
                .inputFluids(Tetrafluoroethylene.getFluid(144))
                .outputFluids(Polytetrafluoroethylene.getFluid(216))
                .duration(160).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("ptfe_" + id++)
                .circuitMeta(2)
                .inputFluids(Air.getFluid(7500))
                .inputFluids(Tetrafluoroethylene.getFluid(2160))
                .inputFluids(TitaniumTetrachloride.getFluid(100))
                .outputFluids(Polytetrafluoroethylene.getFluid(3240))
                .duration(800).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("ptfe_" + id++)
                .circuitMeta(2)
                .inputFluids(Oxygen.getFluid(7500))
                .inputFluids(Tetrafluoroethylene.getFluid(2160))
                .inputFluids(TitaniumTetrachloride.getFluid(100))
                .outputFluids(Polytetrafluoroethylene.getFluid(4320))
                .duration(800).EUt(VA[LV]).save(provider);
    }

    private static void epoxyProcess(Consumer<FinishedRecipe> provider) {
        var id = 0;
        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dustTiny, SodiumHydroxide)
                .inputFluids(SeedOil.getFluid(6000))
                .inputFluids(Methanol.getFluid(1000))
                .outputFluids(Glycerol.getFluid(1000))
                .outputFluids(BioDiesel.getFluid(6000))
                .duration(600).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dustTiny, SodiumHydroxide)
                .inputFluids(SeedOil.getFluid(6000))
                .inputFluids(Ethanol.getFluid(1000))
                .outputFluids(Glycerol.getFluid(1000))
                .outputFluids(BioDiesel.getFluid(6000))
                .duration(600).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dustTiny, SodiumHydroxide)
                .inputFluids(FishOil.getFluid(6000))
                .inputFluids(Methanol.getFluid(1000))
                .outputFluids(Glycerol.getFluid(1000))
                .outputFluids(BioDiesel.getFluid(6000))
                .duration(600).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dustTiny, SodiumHydroxide)
                .inputFluids(FishOil.getFluid(6000))
                .inputFluids(Ethanol.getFluid(1000))
                .outputFluids(Glycerol.getFluid(1000))
                .outputFluids(BioDiesel.getFluid(6000))
                .duration(600).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dust, SodiumHydroxide)
                .inputFluids(SeedOil.getFluid(54000))
                .inputFluids(Methanol.getFluid(9000))
                .outputFluids(Glycerol.getFluid(9000))
                .outputFluids(BioDiesel.getFluid(54000))
                .duration(5400).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dust, SodiumHydroxide)
                .inputFluids(SeedOil.getFluid(54000))
                .inputFluids(Ethanol.getFluid(9000))
                .outputFluids(Glycerol.getFluid(9000))
                .outputFluids(BioDiesel.getFluid(54000))
                .duration(5400).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dust, SodiumHydroxide)
                .inputFluids(FishOil.getFluid(54000))
                .inputFluids(Methanol.getFluid(9000))
                .outputFluids(Glycerol.getFluid(9000))
                .outputFluids(BioDiesel.getFluid(54000))
                .duration(5400).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dust, SodiumHydroxide)
                .inputFluids(FishOil.getFluid(54000))
                .inputFluids(Ethanol.getFluid(9000))
                .outputFluids(Glycerol.getFluid(9000))
                .outputFluids(BioDiesel.getFluid(54000))
                .duration(5400).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputFluids(Propene.getFluid(1000))
                .inputFluids(Chlorine.getFluid(2000))
                .circuitMeta(1)
                .outputFluids(HydrochloricAcid.getFluid(1000))
                .outputFluids(AllylChloride.getFluid(1000))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputFluids(Glycerol.getFluid(1000))
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .outputFluids(Water.getFluid(2000))
                .outputFluids(Epichlorohydrin.getFluid(1000))
                .duration(480).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dust, SodiumHydroxide, 3)
                .inputFluids(AllylChloride.getFluid(1000))
                .inputFluids(HypochlorousAcid.getFluid(1000))
                .outputFluids(SaltWater.getFluid(1000))
                .outputFluids(Epichlorohydrin.getFluid(1000))
                .duration(480).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .circuitMeta(23)
                .inputFluids(Chlorine.getFluid(4000))
                .inputFluids(Propene.getFluid(1000))
                .inputFluids(Water.getFluid(1000))
                .inputItems(dust, SodiumHydroxide, 3)
                .outputFluids(Epichlorohydrin.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(2000))
                .outputFluids(SaltWater.getFluid(1000))
                .duration(640).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .circuitMeta(24)
                .inputFluids(Chlorine.getFluid(2000))
                .inputFluids(Propene.getFluid(1000))
                .inputFluids(HypochlorousAcid.getFluid(1000))
                .inputItems(dust, SodiumHydroxide, 3)
                .outputFluids(Epichlorohydrin.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(1000))
                .outputFluids(SaltWater.getFluid(1000))
                .duration(640).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputFluids(Oxygen.getFluid(2000))
                .inputFluids(Cumene.getFluid(1000))
                .outputFluids(Phenol.getFluid(1000))
                .outputFluids(Acetone.getFluid(1000))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .circuitMeta(1)
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .inputFluids(Acetone.getFluid(1000))
                .inputFluids(Phenol.getFluid(2000))
                .outputFluids(BisphenolA.getFluid(1000))
                .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
                .duration(160).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .inputItems(dust, SodiumHydroxide, 3)
                .inputFluids(Epichlorohydrin.getFluid(1000))
                .inputFluids(BisphenolA.getFluid(1000))
                .outputFluids(Epoxy.getFluid(1000))
                .outputFluids(SaltWater.getFluid(1000))
                .duration(200).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("epoxy_" + id++)
                .circuitMeta(24)
                .inputFluids(Epichlorohydrin.getFluid(1000))
                .inputFluids(Phenol.getFluid(2000))
                .inputFluids(Acetone.getFluid(1000))
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .inputItems(dust, SodiumHydroxide, 3)
                .outputFluids(Epoxy.getFluid(1000))
                .outputFluids(SaltWater.getFluid(1000))
                .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
                .duration(480).EUt(VA[LV]).save(provider);
    }

    private static void styreneButadieneProcess(Consumer<FinishedRecipe> provider) {
        var id = 0;

        CHEMICAL_RECIPES.recipeBuilder("styrene_butadiene_" + id++)
                .inputFluids(Ethylene.getFluid(1000))
                .inputFluids(Benzene.getFluid(1000))
                .outputFluids(Hydrogen.getFluid(2000))
                .outputFluids(Styrene.getFluid(1000))
                .duration(120).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("styrene_butadiene_" + id++)
                .inputFluids(Ethylbenzene.getFluid(1000))
                .outputFluids(Styrene.getFluid(1000))
                .outputFluids(Hydrogen.getFluid(2000))
                .duration(30).EUt(VA[LV])
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("styrene_butadiene_" + id++)
                .inputFluids(Butadiene.getFluid(3000))
                .inputFluids(Styrene.getFluid(1000))
                .inputFluids(Air.getFluid(15000))
                .outputItems(dust, RawStyreneButadieneRubber, 27)
                .duration(480).EUt(240).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("styrene_butadiene_" + id++)
                .inputFluids(Butadiene.getFluid(3000))
                .inputFluids(Styrene.getFluid(1000))
                .inputFluids(Oxygen.getFluid(15000))
                .outputItems(dust, RawStyreneButadieneRubber, 41)
                .duration(480).EUt(240).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("styrene_butadiene_" + id++)
                .inputItems(dust, RawStyreneButadieneRubber, 9)
                .inputItems(dust, Sulfur)
                .outputFluids(StyreneButadieneRubber.getFluid(1296))
                .duration(600).EUt(VA[LV]).save(provider);
    }

    private static void polybenzimidazoleProcess(Consumer<FinishedRecipe> provider) {
        var id = 0;

        CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[IV]).duration(100)
                .inputFluids(Diaminobenzidine.getFluid(1000))
                .inputFluids(DiphenylIsophtalate.getFluid(1000))
                .outputFluids(Phenol.getFluid(1000))
                .outputFluids(Polybenzimidazole.getFluid(1008))
                .save(provider);

        // 3,3-Diaminobenzidine
        LARGE_CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[IV]).duration(100)
                .inputFluids(Dichlorobenzidine.getFluid(1000))
                .inputFluids(Ammonia.getFluid(2000))
                .notConsumable(ChemicalHelper.get(dust, Zinc))
                .outputFluids(Diaminobenzidine.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(2000))
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[EV]).duration(200)
                .inputItems(dustTiny, Copper)
                .inputFluids(Nitrochlorobenzene.getFluid(2000))
                .inputFluids(Hydrogen.getFluid(2000))
                .outputFluids(Dichlorobenzidine.getFluid(1000))
                .save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[EV]).duration(1800)
                .inputItems(dust, Copper)
                .inputFluids(Nitrochlorobenzene.getFluid(18000))
                .inputFluids(Hydrogen.getFluid(18000))
                .outputFluids(Dichlorobenzidine.getFluid(9000))
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[HV]).duration(100)
                .inputFluids(NitrationMixture.getFluid(2000))
                .inputFluids(Chlorobenzene.getFluid(1000))
                .outputFluids(Nitrochlorobenzene.getFluid(1000))
                .outputFluids(DilutedSulfuricAcid.getFluid(1000))
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[LV]).duration(240)
                .inputFluids(Chlorine.getFluid(2000))
                .inputFluids(Benzene.getFluid(1000))
                .circuitMeta(1)
                .outputFluids(Chlorobenzene.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(1000))
                .save(provider);

        // Diphenyl Isophthalate
        LARGE_CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[IV]).duration(100)
                .inputFluids(Phenol.getFluid(2000))
                .inputFluids(SulfuricAcid.getFluid(1000))
                .inputFluids(PhthalicAcid.getFluid(1000))
                .outputFluids(DiphenylIsophtalate.getFluid(1000))
                .outputFluids(DilutedSulfuricAcid.getFluid(1000))
                .save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[EV]).duration(100)
                .inputItems(dustTiny, PotassiumDichromate)
                .inputFluids(Dimethylbenzene.getFluid(1000))
                .inputFluids(Oxygen.getFluid(2000))
                .outputFluids(PhthalicAcid.getFluid(1000))
                .outputFluids(Water.getFluid(2000))
                .save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[EV]).duration(900)
                .inputItems(dust, PotassiumDichromate)
                .inputFluids(Dimethylbenzene.getFluid(9000))
                .inputFluids(Oxygen.getFluid(18000))
                .outputFluids(PhthalicAcid.getFluid(9000))
                .outputFluids(Water.getFluid(18000))
                .save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[LV]).duration(125)
                .inputFluids(Naphthalene.getFluid(2000))
                .inputFluids(SulfuricAcid.getFluid(1000))
                .inputItems(dustTiny, Potassium)
                .outputFluids(PhthalicAcid.getFluid(2500))
                .outputFluids(HydrogenSulfide.getFluid(1000))
                .save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[LV]).duration(1125)
                .inputFluids(Naphthalene.getFluid(18000))
                .inputFluids(SulfuricAcid.getFluid(9000))
                .inputItems(dust, Potassium)
                .outputFluids(PhthalicAcid.getFluid(22500))
                .outputFluids(HydrogenSulfide.getFluid(9000))
                .save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[MV]).duration(4000)
                .inputFluids(Methane.getFluid(2000))
                .inputFluids(Benzene.getFluid(1000))
                .circuitMeta(1)
                .outputFluids(Dimethylbenzene.getFluid(1000))
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(VA[HV]).duration(100)
                .inputItems(dust, Saltpeter, 10)
                .inputItems(dust, ChromiumTrioxide, 8)
                .outputItems(dust, PotassiumDichromate, 11)
                .outputFluids(NitrogenDioxide.getFluid(2000))
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polybenzimidazole_" + id++).EUt(60).duration(100)
                .inputItems(dust, Chrome)
                .inputFluids(Oxygen.getFluid(3000))
                .outputItems(dust, ChromiumTrioxide, 4)
                .save(provider);
    }

    public static void polycaprolactamProcess(Consumer<FinishedRecipe> provider) {
        var id = 0;
        CHEMICAL_RECIPES.recipeBuilder("polycaprolactam_" + id++).EUt(VA[HV]).duration(400)
                .notConsumable(ChemicalHelper.get(dust, Nickel))
                .inputFluids(Benzene.getFluid(1000))
                .inputFluids(Hydrogen.getFluid(6000))
                .outputFluids(Cyclohexane.getFluid(1000))
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polycaprolactam_" + id++).EUt(VA[LV]).duration(100)
                .inputFluids(Chlorine.getFluid(1000))
                .inputFluids(NitricOxide.getFluid(1000))
                .outputFluids(NitrosylChloride.getFluid(1000))
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polycaprolactam_" + id++).EUt(VA[MV]).duration(100)
                .inputFluids(Cyclohexane.getFluid(1000))
                .inputFluids(NitrosylChloride.getFluid(1000))
                .outputItems(dust, CyclohexanoneOxime, 19)
                .outputFluids(HydrochloricAcid.getFluid(1000))
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder("polycaprolactam_" + id++).EUt(VA[HV]).duration(200)
                .inputItems(dust, CyclohexanoneOxime, 19)
                .inputFluids(SulfuricAcid.getFluid(1000))
                .outputItems(dust, Caprolactam, 19)
                .outputFluids(DilutedSulfuricAcid.getFluid(1000))
                .save(provider);

        BLAST_RECIPES.recipeBuilder("polycaprolactam_" + id++).EUt(VA[MV]).duration(150).blastFurnaceTemp(533)
                .inputItems(dust, Caprolactam, 1)
                .inputFluids(Nitrogen.getFluid(1000))
                .outputItems(ingot, Polycaprolactam, 1)
                .save(provider);

    }
}
