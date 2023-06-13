.class public final LOI$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOI;->H0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LXn1;",
        "LXn1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LXn1;",
        "it",
        "a",
        "(LXn1;)LXn1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, LOI$u;->g:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LXn1;)LXn1;
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "it"

    move-object/from16 v13, p1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual/range {p1 .. p1}, LXn1;->g()I

    move-result v13

    add-int/lit8 v13, v13, 0x1

    const/4 v14, 0x1

    move-object/from16 v15, p0

    iget v1, v15, LOI$u;->g:I

    move v15, v1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const v18, 0x18fff

    const/16 v19, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v19}, LXn1;->copy$default(LXn1;ILco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;Lco/bird/android/model/VehicleDescriptor;LXn1$a;LXn1$b;[B[Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/Long;IIIZILjava/lang/String;Lorg/joda/time/DateTime;ILjava/lang/Object;)LXn1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LXn1;

    invoke-virtual {p0, p1}, LOI$u;->a(LXn1;)LXn1;

    move-result-object p1

    return-object p1
.end method
