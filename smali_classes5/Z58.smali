.class public final synthetic LZ58;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final synthetic b:LZ58;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LZ58;

    invoke-direct {v0}, LZ58;-><init>()V

    sput-object v0, LZ58;->b:LZ58;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    new-instance v0, LJx9;

    invoke-direct {v0}, LJx9;-><init>()V

    return-object v0
.end method
