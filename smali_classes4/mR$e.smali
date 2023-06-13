.class public LmR$e;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmR;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:LmR;


# direct methods
.method public constructor <init>(LmR;LEb5;)V
    .locals 0

    iput-object p1, p0, LmR$e;->d:LmR;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE bird_plus_view SET status = \'active\' WHERE user_subscription_id = ?"

    return-object v0
.end method
