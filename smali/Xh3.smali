.class public interface abstract LXh3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXh3$b;
    }
.end annotation


# static fields
.field public static final a:LXh3$b$c;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field

.field public static final b:LXh3$b$b;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LXh3$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LXh3$b$c;-><init>(LXh3$a;)V

    sput-object v0, LXh3;->a:LXh3$b$c;

    new-instance v0, LXh3$b$b;

    invoke-direct {v0, v1}, LXh3$b$b;-><init>(LXh3$a;)V

    sput-object v0, LXh3;->b:LXh3$b$b;

    return-void
.end method
