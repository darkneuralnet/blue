.class public final Lcom/stripe/android/uicore/PrimaryButtonTypography;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001e\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J,\u0010\r\u001a\u00020\u00002\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0004R \u0010\n\u001a\u00020\u00058\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0007\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/uicore/PrimaryButtonTypography;",
        "",
        "",
        "component1",
        "()Ljava/lang/Integer;",
        "LM26;",
        "component2-XSAIIZE",
        "()J",
        "component2",
        "fontFamily",
        "fontSize",
        "copy-mpE4wyQ",
        "(Ljava/lang/Integer;J)Lcom/stripe/android/uicore/PrimaryButtonTypography;",
        "copy",
        "",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "Ljava/lang/Integer;",
        "getFontFamily",
        "J",
        "getFontSize-XSAIIZE",
        "<init>",
        "(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
.field private final fontFamily:Ljava/lang/Integer;

.field private final fontSize:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/Integer;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    iput-wide p2, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/PrimaryButtonTypography;-><init>(Ljava/lang/Integer;J)V

    return-void
.end method

.method public static synthetic copy-mpE4wyQ$default(Lcom/stripe/android/uicore/PrimaryButtonTypography;Ljava/lang/Integer;JILjava/lang/Object;)Lcom/stripe/android/uicore/PrimaryButtonTypography;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->copy-mpE4wyQ(Ljava/lang/Integer;J)Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2-XSAIIZE()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    return-wide v0
.end method

.method public final copy-mpE4wyQ(Ljava/lang/Integer;J)Lcom/stripe/android/uicore/PrimaryButtonTypography;
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/PrimaryButtonTypography;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/stripe/android/uicore/PrimaryButtonTypography;-><init>(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/PrimaryButtonTypography;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/PrimaryButtonTypography;

    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    iget-wide v5, p1, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    invoke-static {v3, v4, v5, v6}, LM26;->e(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFontFamily()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFontSize-XSAIIZE()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    invoke-static {v1, v2}, LM26;->i(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    iget-wide v1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    invoke-static {v1, v2}, LM26;->j(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PrimaryButtonTypography(fontFamily="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fontSize="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
