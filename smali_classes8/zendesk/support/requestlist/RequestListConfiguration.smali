.class public Lzendesk/support/requestlist/RequestListConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldx0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/requestlist/RequestListConfiguration$Builder;
    }
.end annotation


# instance fields
.field private final configurations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldx0;",
            ">;"
        }
    .end annotation
.end field

.field private final contactUsButtonVisible:Z


# direct methods
.method private constructor <init>(Lzendesk/support/requestlist/RequestListConfiguration$Builder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lzendesk/support/requestlist/RequestListConfiguration$Builder;->access$000(Lzendesk/support/requestlist/RequestListConfiguration$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lzendesk/support/requestlist/RequestListConfiguration;->contactUsButtonVisible:Z

    invoke-static {p1}, Lzendesk/support/requestlist/RequestListConfiguration$Builder;->access$100(Lzendesk/support/requestlist/RequestListConfiguration$Builder;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/requestlist/RequestListConfiguration;->configurations:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/support/requestlist/RequestListConfiguration$Builder;Lzendesk/support/requestlist/RequestListConfiguration$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/requestlist/RequestListConfiguration;-><init>(Lzendesk/support/requestlist/RequestListConfiguration$Builder;)V

    return-void
.end method


# virtual methods
.method public getConfigurations()Ljava/util/List;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldx0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListConfiguration;->configurations:Ljava/util/List;

    invoke-static {v0, p0}, LEx0;->a(Ljava/util/List;Ldx0;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public isContactUsButtonVisible()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/support/requestlist/RequestListConfiguration;->contactUsButtonVisible:Z

    return v0
.end method
