.class public final synthetic LQL7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ78;


# static fields
.field public static final synthetic a:LQL7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LQL7;

    invoke-direct {v0}, LQL7;-><init>()V

    sput-object v0, LQL7;->a:LQL7;

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

    invoke-static {}, LYa9;->t()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
