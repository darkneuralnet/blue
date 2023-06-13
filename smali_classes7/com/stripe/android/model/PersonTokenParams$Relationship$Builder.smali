.class public final Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ObjectBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PersonTokenParams$Relationship;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ObjectBuilder<",
        "Lcom/stripe/android/model/PersonTokenParams$Relationship;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u000f\u001a\u00020\u0002H\u0016J\u0015\u0010\u0010\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;",
        "Lcom/stripe/android/ObjectBuilder;",
        "Lcom/stripe/android/model/PersonTokenParams$Relationship;",
        "()V",
        "director",
        "",
        "Ljava/lang/Boolean;",
        "executive",
        "owner",
        "percentOwnership",
        "",
        "Ljava/lang/Integer;",
        "representative",
        "title",
        "",
        "build",
        "setDirector",
        "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;",
        "setExecutive",
        "setOwner",
        "setPercentOwnership",
        "(Ljava/lang/Integer;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;",
        "setRepresentative",
        "setTitle",
        "payments-core_release"
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
.field private director:Ljava/lang/Boolean;

.field private executive:Ljava/lang/Boolean;

.field private owner:Ljava/lang/Boolean;

.field private percentOwnership:Ljava/lang/Integer;

.field private representative:Ljava/lang/Boolean;

.field private title:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/model/PersonTokenParams$Relationship;
    .locals 8

    new-instance v7, Lcom/stripe/android/model/PersonTokenParams$Relationship;

    iget-object v1, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->director:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->executive:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->owner:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->percentOwnership:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->representative:Ljava/lang/Boolean;

    iget-object v6, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->title:Ljava/lang/String;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/model/PersonTokenParams$Relationship;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object v7
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->build()Lcom/stripe/android/model/PersonTokenParams$Relationship;

    move-result-object v0

    return-object v0
.end method

.method public final setDirector(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->director:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final setExecutive(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->executive:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final setOwner(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->owner:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final setPercentOwnership(Ljava/lang/Integer;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->percentOwnership:Ljava/lang/Integer;

    return-object p0
.end method

.method public final setRepresentative(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->representative:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final setTitle(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;->title:Ljava/lang/String;

    return-object p0
.end method
