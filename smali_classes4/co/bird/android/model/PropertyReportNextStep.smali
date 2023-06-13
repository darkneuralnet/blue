.class public final enum Lco/bird/android/model/PropertyReportNextStep;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/PropertyReportNextStep;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/PropertyReportNextStep;",
        "",
        "label",
        "",
        "(Ljava/lang/String;II)V",
        "getLabel",
        "()I",
        "toString",
        "",
        "FOLLOW_UP_VISIT",
        "ESCALATE_TO_HRR",
        "NO_ACTION_NEEDED",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/PropertyReportNextStep;

.field public static final enum ESCALATE_TO_HRR:Lco/bird/android/model/PropertyReportNextStep;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "escalat_to_hrr"
    .end annotation

    .annotation runtime Lft5;
        value = "escalat_to_hrr"
    .end annotation
.end field

.field public static final enum FOLLOW_UP_VISIT:Lco/bird/android/model/PropertyReportNextStep;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "follow_up_visit"
    .end annotation

    .annotation runtime Lft5;
        value = "follow_up_visit"
    .end annotation
.end field

.field public static final enum NO_ACTION_NEEDED:Lco/bird/android/model/PropertyReportNextStep;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "no_action_needed"
    .end annotation

    .annotation runtime Lft5;
        value = "no_action_needed"
    .end annotation
.end field


# instance fields
.field private final label:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/PropertyReportNextStep;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/model/PropertyReportNextStep;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/PropertyReportNextStep;->FOLLOW_UP_VISIT:Lco/bird/android/model/PropertyReportNextStep;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/PropertyReportNextStep;->ESCALATE_TO_HRR:Lco/bird/android/model/PropertyReportNextStep;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/PropertyReportNextStep;->NO_ACTION_NEEDED:Lco/bird/android/model/PropertyReportNextStep;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/PropertyReportNextStep;

    const/4 v1, 0x0

    sget v2, Lnl4;->property_report_next_step_follow_up_visit:I

    const-string v3, "FOLLOW_UP_VISIT"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/PropertyReportNextStep;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/PropertyReportNextStep;->FOLLOW_UP_VISIT:Lco/bird/android/model/PropertyReportNextStep;

    new-instance v0, Lco/bird/android/model/PropertyReportNextStep;

    const/4 v1, 0x1

    sget v2, Lnl4;->property_report_next_step_escalate_to_hrr:I

    const-string v3, "ESCALATE_TO_HRR"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/PropertyReportNextStep;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/PropertyReportNextStep;->ESCALATE_TO_HRR:Lco/bird/android/model/PropertyReportNextStep;

    new-instance v0, Lco/bird/android/model/PropertyReportNextStep;

    const/4 v1, 0x2

    sget v2, Lnl4;->property_report_next_step_no_action_needed:I

    const-string v3, "NO_ACTION_NEEDED"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/PropertyReportNextStep;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/PropertyReportNextStep;->NO_ACTION_NEEDED:Lco/bird/android/model/PropertyReportNextStep;

    invoke-static {}, Lco/bird/android/model/PropertyReportNextStep;->$values()[Lco/bird/android/model/PropertyReportNextStep;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/PropertyReportNextStep;->$VALUES:[Lco/bird/android/model/PropertyReportNextStep;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/PropertyReportNextStep;->label:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/PropertyReportNextStep;
    .locals 1

    const-class v0, Lco/bird/android/model/PropertyReportNextStep;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/PropertyReportNextStep;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/PropertyReportNextStep;
    .locals 1

    sget-object v0, Lco/bird/android/model/PropertyReportNextStep;->$VALUES:[Lco/bird/android/model/PropertyReportNextStep;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/PropertyReportNextStep;

    return-object v0
.end method


# virtual methods
.method public final getLabel()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/PropertyReportNextStep;->label:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
