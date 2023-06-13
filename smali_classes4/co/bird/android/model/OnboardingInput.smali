.class public final enum Lco/bird/android/model/OnboardingInput;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/OnboardingInput;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B-\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\tj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/model/OnboardingInput;",
        "",
        "type",
        "",
        "title",
        "hint",
        "action",
        "(Ljava/lang/String;IIIII)V",
        "getAction",
        "()I",
        "getHint",
        "getTitle",
        "getType",
        "EMAIL",
        "CODE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/OnboardingInput;

.field public static final enum CODE:Lco/bird/android/model/OnboardingInput;

.field public static final enum EMAIL:Lco/bird/android/model/OnboardingInput;


# instance fields
.field private final action:I

.field private final hint:I

.field private final title:I

.field private final type:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/OnboardingInput;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/OnboardingInput;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/OnboardingInput;->EMAIL:Lco/bird/android/model/OnboardingInput;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/OnboardingInput;->CODE:Lco/bird/android/model/OnboardingInput;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 15

    new-instance v7, Lco/bird/android/model/OnboardingInput;

    const-string v1, "EMAIL"

    const/4 v2, 0x0

    const/16 v3, 0x20

    sget v4, Lnl4;->map_email_title:I

    sget v5, Lnl4;->map_email:I

    sget v6, Lnl4;->map_email_action:I

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/OnboardingInput;-><init>(Ljava/lang/String;IIIII)V

    sput-object v7, Lco/bird/android/model/OnboardingInput;->EMAIL:Lco/bird/android/model/OnboardingInput;

    new-instance v0, Lco/bird/android/model/OnboardingInput;

    const-string v9, "CODE"

    const/4 v10, 0x1

    const/4 v11, 0x1

    sget v12, Lnl4;->map_code_title:I

    sget v13, Lnl4;->map_code:I

    sget v14, Lnl4;->map_code_action:I

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/OnboardingInput;-><init>(Ljava/lang/String;IIIII)V

    sput-object v0, Lco/bird/android/model/OnboardingInput;->CODE:Lco/bird/android/model/OnboardingInput;

    invoke-static {}, Lco/bird/android/model/OnboardingInput;->$values()[Lco/bird/android/model/OnboardingInput;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/OnboardingInput;->$VALUES:[Lco/bird/android/model/OnboardingInput;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/OnboardingInput;->type:I

    iput p4, p0, Lco/bird/android/model/OnboardingInput;->title:I

    iput p5, p0, Lco/bird/android/model/OnboardingInput;->hint:I

    iput p6, p0, Lco/bird/android/model/OnboardingInput;->action:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/OnboardingInput;
    .locals 1

    const-class v0, Lco/bird/android/model/OnboardingInput;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/OnboardingInput;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/OnboardingInput;
    .locals 1

    sget-object v0, Lco/bird/android/model/OnboardingInput;->$VALUES:[Lco/bird/android/model/OnboardingInput;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/OnboardingInput;

    return-object v0
.end method


# virtual methods
.method public final getAction()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/OnboardingInput;->action:I

    return v0
.end method

.method public final getHint()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/OnboardingInput;->hint:I

    return v0
.end method

.method public final getTitle()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/OnboardingInput;->title:I

    return v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/OnboardingInput;->type:I

    return v0
.end method
