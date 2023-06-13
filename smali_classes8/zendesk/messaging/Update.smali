.class public abstract Lzendesk/messaging/Update;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/Update$ShowDialog;,
        Lzendesk/messaging/Update$ShowBanner;,
        Lzendesk/messaging/Update$ApplyMenuItems;,
        Lzendesk/messaging/Update$Action;,
        Lzendesk/messaging/Update$State;
    }
.end annotation


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/Update;->type:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/Update;->type:Ljava/lang/String;

    return-object v0
.end method
