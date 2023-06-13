.class public final LVj6$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVj6;->b(Ljava/util/List;ILjava/lang/String;La30;FLa30;FFIIFFFFLEt0;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LfJ3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:LVj6$l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LVj6$l;

    invoke-direct {v0}, LVj6$l;-><init>()V

    sput-object v0, LVj6$l;->g:LVj6$l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LfJ3;
    .locals 1

    new-instance v0, LfJ3;

    invoke-direct {v0}, LfJ3;-><init>()V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LVj6$l;->b()LfJ3;

    move-result-object v0

    return-object v0
.end method
