.class public final LYF3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXF3;


# instance fields
.field public final a:LZF3;


# direct methods
.method public constructor <init>(LZF3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYF3;->a:LZF3;

    return-void
.end method

.method public static b(LZF3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZF3;",
            ")",
            "LY94<",
            "LXF3;",
            ">;"
        }
    .end annotation

    new-instance v0, LYF3;

    invoke-direct {v0, p0}, LYF3;-><init>(LZF3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Le13;LaG3;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;)LWF3;
    .locals 1

    iget-object v0, p0, LYF3;->a:LZF3;

    invoke-virtual {v0, p1, p2, p3, p4}, LZF3;->b(Le13;LaG3;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;)LWF3;

    move-result-object p1

    return-object p1
.end method
