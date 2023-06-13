.class public Lzendesk/belvedere/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/belvedere/i$b;,
        Lzendesk/belvedere/i$a;
    }
.end annotation


# static fields
.field public static a:Lzendesk/belvedere/i$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzendesk/belvedere/i$a;

    invoke-direct {v0}, Lzendesk/belvedere/i$a;-><init>()V

    sput-object v0, Lzendesk/belvedere/i;->a:Lzendesk/belvedere/i$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lzendesk/belvedere/i;->a:Lzendesk/belvedere/i$b;

    invoke-interface {v0, p0, p1}, Lzendesk/belvedere/i$b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lzendesk/belvedere/i;->a:Lzendesk/belvedere/i$b;

    invoke-interface {v0, p0, p1}, Lzendesk/belvedere/i$b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lzendesk/belvedere/i;->a:Lzendesk/belvedere/i$b;

    invoke-interface {v0, p0, p1, p2}, Lzendesk/belvedere/i$b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static d(Lzendesk/belvedere/i$b;)V
    .locals 0

    sput-object p0, Lzendesk/belvedere/i;->a:Lzendesk/belvedere/i$b;

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lzendesk/belvedere/i;->a:Lzendesk/belvedere/i$b;

    invoke-interface {v0, p0, p1}, Lzendesk/belvedere/i$b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
