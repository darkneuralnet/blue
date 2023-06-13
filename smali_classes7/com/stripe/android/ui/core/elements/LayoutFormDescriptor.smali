.class public final Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;",
        "",
        "layoutSpec",
        "Lcom/stripe/android/ui/core/elements/LayoutSpec;",
        "showCheckbox",
        "",
        "showCheckboxControlledFields",
        "(Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZ)V",
        "getLayoutSpec",
        "()Lcom/stripe/android/ui/core/elements/LayoutSpec;",
        "getShowCheckbox",
        "()Z",
        "getShowCheckboxControlledFields",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "payments-ui-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

.field private final showCheckbox:Z

.field private final showCheckboxControlledFields:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    iput-boolean p2, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckbox:Z

    iput-boolean p3, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckboxControlledFields:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckbox:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckboxControlledFields:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->copy(Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZ)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/ui/core/elements/LayoutSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckbox:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckboxControlledFields:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZ)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;-><init>(Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckbox:Z

    iget-boolean v3, p1, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckbox:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckboxControlledFields:Z

    iget-boolean p1, p1, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckboxControlledFields:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLayoutSpec()Lcom/stripe/android/ui/core/elements/LayoutSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    return-object v0
.end method

.method public final getShowCheckbox()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckbox:Z

    return v0
.end method

.method public final getShowCheckboxControlledFields()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckboxControlledFields:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/LayoutSpec;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckbox:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckboxControlledFields:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->layoutSpec:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckbox:Z

    iget-boolean v2, p0, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->showCheckboxControlledFields:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "LayoutFormDescriptor(layoutSpec="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showCheckbox="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", showCheckboxControlledFields="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
