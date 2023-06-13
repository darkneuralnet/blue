.class public final Lcom/stripe/android/uicore/elements/OTPElementColors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0019\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J*\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R \u0010\u0008\u001a\u00020\u00028\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0004R \u0010\t\u001a\u00020\u00028\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0014\u001a\u0004\u0008\u0016\u0010\u0004\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/OTPElementColors;",
        "",
        "Lpm0;",
        "component1-0d7_KjU",
        "()J",
        "component1",
        "component2-0d7_KjU",
        "component2",
        "selectedBorder",
        "placeholder",
        "copy--OWjLjI",
        "(JJ)Lcom/stripe/android/uicore/elements/OTPElementColors;",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "J",
        "getSelectedBorder-0d7_KjU",
        "getPlaceholder-0d7_KjU",
        "<init>",
        "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final placeholder:J

.field private final selectedBorder:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->selectedBorder:J

    iput-wide p3, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->placeholder:J

    return-void
.end method

.method public synthetic constructor <init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/OTPElementColors;-><init>(JJ)V

    return-void
.end method

.method public static synthetic copy--OWjLjI$default(Lcom/stripe/android/uicore/elements/OTPElementColors;JJILjava/lang/Object;)Lcom/stripe/android/uicore/elements/OTPElementColors;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->selectedBorder:J

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    iget-wide p3, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->placeholder:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/OTPElementColors;->copy--OWjLjI(JJ)Lcom/stripe/android/uicore/elements/OTPElementColors;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1-0d7_KjU()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->selectedBorder:J

    return-wide v0
.end method

.method public final component2-0d7_KjU()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->placeholder:J

    return-wide v0
.end method

.method public final copy--OWjLjI(JJ)Lcom/stripe/android/uicore/elements/OTPElementColors;
    .locals 7

    new-instance v6, Lcom/stripe/android/uicore/elements/OTPElementColors;

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/OTPElementColors;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/OTPElementColors;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/OTPElementColors;

    iget-wide v3, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->selectedBorder:J

    iget-wide v5, p1, Lcom/stripe/android/uicore/elements/OTPElementColors;->selectedBorder:J

    invoke-static {v3, v4, v5, v6}, Lpm0;->o(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->placeholder:J

    iget-wide v5, p1, Lcom/stripe/android/uicore/elements/OTPElementColors;->placeholder:J

    invoke-static {v3, v4, v5, v6}, Lpm0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getPlaceholder-0d7_KjU()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->placeholder:J

    return-wide v0
.end method

.method public final getSelectedBorder-0d7_KjU()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->selectedBorder:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->selectedBorder:J

    invoke-static {v0, v1}, Lpm0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->placeholder:J

    invoke-static {v1, v2}, Lpm0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->selectedBorder:J

    invoke-static {v0, v1}, Lpm0;->v(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lcom/stripe/android/uicore/elements/OTPElementColors;->placeholder:J

    invoke-static {v1, v2}, Lpm0;->v(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OTPElementColors(selectedBorder="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", placeholder="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
