.class public final Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0008\u0000\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000e\u0010\u0019\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001aJ\u000e\u0010\u001b\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001cJ\u000e\u0010\u001d\u001a\u00020\nH\u00c0\u0003\u00a2\u0006\u0002\u0008\u001eJ=\u0010\u001f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010 \u001a\u00020\u00072\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0008\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "",
        "userInput",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "merchantName",
        "",
        "isExpanded",
        "",
        "apiFailed",
        "signUpState",
        "Lcom/stripe/android/link/ui/signup/SignUpState;",
        "(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;)V",
        "getApiFailed$link_release",
        "()Z",
        "isExpanded$link_release",
        "getMerchantName",
        "()Ljava/lang/String;",
        "getSignUpState$link_release",
        "()Lcom/stripe/android/link/ui/signup/SignUpState;",
        "useLink",
        "getUseLink",
        "getUserInput",
        "()Lcom/stripe/android/link/ui/inline/UserInput;",
        "component1",
        "component2",
        "component3",
        "component3$link_release",
        "component4",
        "component4$link_release",
        "component5",
        "component5$link_release",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "link_release"
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
.field public static final $stable:I


# instance fields
.field private final apiFailed:Z

.field private final isExpanded:Z

.field private final merchantName:Ljava/lang/String;

.field private final signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

.field private final useLink:Z

.field private final userInput:Lcom/stripe/android/link/ui/inline/UserInput;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;)V
    .locals 1

    const-string v0, "merchantName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    iput-object p5, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->useLink:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;ILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move p5, v0

    move p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3$link_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    return v0
.end method

.method public final component4$link_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    return v0
.end method

.method public final component5$link_release()Lcom/stripe/android/link/ui/signup/SignUpState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 7

    const-string v0, "merchantName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;-><init>(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-object p1, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getApiFailed$link_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    return v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getSignUpState$link_release()Lcom/stripe/android/link/ui/signup/SignUpState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    return-object v0
.end method

.method public final getUseLink()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->useLink:Z

    return v0
.end method

.method public final getUserInput()Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isExpanded$link_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    iget-object v4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "InlineSignupViewState(userInput="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", merchantName="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isExpanded="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", apiFailed="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", signUpState="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
