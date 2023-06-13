.class public final synthetic LiE8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLD8;


# static fields
.field public static final synthetic b:LiE8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LiE8;

    invoke-direct {v0}, LiE8;-><init>()V

    sput-object v0, LiE8;->b:LiE8;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
