.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La24;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La24<",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;",
        "La24;",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
        "Lkotlin/sequences/Sequence;",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "<init>",
        "()V",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;


# instance fields
.field private final values:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    sget-object v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeSearchingInstitutions()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeWithResults()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x2

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeNoResults()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x3

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeNoQuery()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x4

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->noSearchMode()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->values:Lkotlin/sequences/Sequence;

    return-void
.end method


# virtual methods
.method public bridge synthetic getCount()I
    .locals 1

    invoke-super {p0}, La24;->getCount()I

    move-result v0

    return v0
.end method

.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
