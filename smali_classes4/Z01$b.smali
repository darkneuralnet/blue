.class public final LZ01$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ01;-><init>(Lcom/google/android/libraries/places/api/net/PlacesClient;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;",
        "kotlin.jvm.PlatformType",
        "b",
        "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LZ01$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ01$b;

    invoke-direct {v0}, LZ01$b;-><init>()V

    sput-object v0, LZ01$b;->g:LZ01$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;
    .locals 1

    invoke-static {}, Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;->newInstance()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZ01$b;->b()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;

    move-result-object v0

    return-object v0
.end method
