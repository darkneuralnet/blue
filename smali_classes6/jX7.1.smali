.class public final synthetic LjX7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ78;


# static fields
.field public static final synthetic a:LjX7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LjX7;

    invoke-direct {v0}, LjX7;-><init>()V

    sput-object v0, LjX7;->a:LjX7;

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

    sget-object v0, La98;->a:Ljava/util/List;

    invoke-static {}, Ltk9;->d()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
