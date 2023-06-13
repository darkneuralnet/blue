.class Lzendesk/core/BlipsRequest$ApiPageView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/core/BlipsRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ApiPageView"
.end annotation


# instance fields
.field private navigatorLanguage:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "navigatorLanguage"
    .end annotation
.end field

.field private pageId:Ljava/lang/Long;
    .annotation runtime Lft5;
        value = "pageId"
    .end annotation
.end field

.field private pageLocale:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "pageLocale"
    .end annotation
.end field

.field private pageTitle:Ljava/lang/String;
    .annotation runtime Lft5;
        value = "pageTitle"
    .end annotation
.end field

.field private value:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/BlipsRequest$ApiPageView;->navigatorLanguage:Ljava/lang/String;

    iput-object p2, p0, Lzendesk/core/BlipsRequest$ApiPageView;->pageTitle:Ljava/lang/String;

    iput-object p5, p0, Lzendesk/core/BlipsRequest$ApiPageView;->value:Ljava/util/Map;

    iput-object p3, p0, Lzendesk/core/BlipsRequest$ApiPageView;->pageId:Ljava/lang/Long;

    iput-object p4, p0, Lzendesk/core/BlipsRequest$ApiPageView;->pageLocale:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getNavigatorLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/core/BlipsRequest$ApiPageView;->navigatorLanguage:Ljava/lang/String;

    return-object v0
.end method

.method public getPageId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lzendesk/core/BlipsRequest$ApiPageView;->pageId:Ljava/lang/Long;

    return-object v0
.end method

.method public getPageLocale()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/core/BlipsRequest$ApiPageView;->pageLocale:Ljava/lang/String;

    return-object v0
.end method

.method public getPageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/core/BlipsRequest$ApiPageView;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/core/BlipsRequest$ApiPageView;->value:Ljava/util/Map;

    return-object v0
.end method
