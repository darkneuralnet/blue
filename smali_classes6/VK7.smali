.class public final synthetic LVK7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ78;


# static fields
.field public static final synthetic a:LVK7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LVK7;

    invoke-direct {v0}, LVK7;-><init>()V

    sput-object v0, LVK7;->a:LVK7;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    sget-object v0, La98;->a:Ljava/util/List;

    invoke-static {}, LYa9;->h()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
