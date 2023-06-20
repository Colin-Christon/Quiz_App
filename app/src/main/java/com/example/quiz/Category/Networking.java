package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class Networking {

    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> networking(String setName){
        if(setName.equals("SET-1")){
            setOne();
        }
        else if (setName.equals("SET-2")) {
            setTwo();
        }
        else if (setName.equals("SET-3")) {
            setThree();
        }
        else if (setName.equals("SET-4")) {
            setFour();
        }
        else if (setName.equals("SET-5")) {
            setFive();
        }
        else if (setName.equals("SET-6")) {
            setSix();
        }
        else if (setName.equals("SET-7")) {
            setSeven();
        }
        else if (setName.equals("SET-8")) {
            setEight();
        }
        else if (setName.equals("SET-9")) {
            setNine();
        }
        else if (setName.equals("SET-10")) {
            setTen();
        }
        return list;
    }

    private void setOne(){
        list.add(new QuestionModel("What is the role of an IP address in networking?",
                "To establish a secure connection between two devices", "To filter network traffic", "To uniquely identify a device on a network", "To convert domain names into numerical addresses", "To uniquely identify a device on a network"));
        list.add(new QuestionModel("What is the purpose of a subnet mask in networking?",
                "To encrypt data transmitted over the network", "To determine the network portion of an IP address", "To establish a VPN connection", "To define the maximum transmission unit (MTU) size", "To determine the network portion of an IP address"));
        list.add(new QuestionModel("What is the function of a default gateway in networking?",
                "To connect multiple local networks", "To provide wireless access to the network", "To monitor network performance", "To route network traffic between different networks", "To route network traffic between different networks"));
        list.add(new QuestionModel("What is the purpose of DNS (Domain Name System) in networking?",
                "To secure network communications", "To convert domain names into IP addresses", "To manage network routing tables", "To establish VPN connections", "To convert domain names into IP addresses"));
        list.add(new QuestionModel("What is the difference between TCP (Transmission Control Protocol) and UDP (User Datagram Protocol)?",
                "TCP is faster than UDP for real-time applications", "UDP provides stronger encryption than TCP", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order", "TCP is used for video streaming, while UDP is used for web browsing", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order"));
        list.add(new QuestionModel("What is the function of a router in networking?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the purpose of NAT (Network Address Translation) in networking?",
                "To encrypt network traffic", "To allow multiple devices to share a single public IP address", "To block unauthorized access to the network", "To route network traffic between different networks", "To allow multiple devices to share a single public IP address"));
        list.add(new QuestionModel("What is the difference between a hub and a switch in networking?",
                "A hub supports higher network speeds than a switch", "A hub provides wireless access to the network, while a switch connects multiple local networks", "A hub provides stronger security than a switch", "A hub operates at the physical layer and broadcasts data to all connected devices, while a switch operates at the data link layer and selectively forwards data to the intended recipient", "A hub operates at the physical layer and broadcasts data to all connected devices, while a switch operates at the data link layer and selectively forwards data to the intended recipient"));
        list.add(new QuestionModel("What is the purpose of a firewall in networking?",
                "To establish secure connections between two devices", "To protect a network from unauthorized access and external threats", "To convert domain names into IP addresses", "To filter network traffic based on port numbers", "To protect a network from unauthorized access and external threats"));
        list.add(new QuestionModel("What is the difference between a MAC address and an IP address?",
                "A MAC address is used for wireless networks, while an IP address is used for wired networks", "A MAC address is assigned by the ISP, while an IP address is assigned by the device manufacturer", "A MAC address uniquely identifies a network device, while an IP address identifies a network or host", "A MAC address is a physical address assigned to a network interface, while an IP address is a logical address used for network communication", "A MAC address is a physical address assigned to a network interface, while an IP address is a logical address used for network communication"));

    }

    private void setTwo(){
        list.add(new QuestionModel("What is the purpose of ARP (Address Resolution Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To map an IP address to a MAC address", "To establish VPN connections", "To map an IP address to a MAC address"));
        list.add(new QuestionModel("What is the function of a network switch in networking?",
                "To filter network traffic", "To provide wireless access to the network", "To connect multiple devices within a local network and facilitate data transmission", "To establish VPN connections", "To connect multiple devices within a local network and facilitate data transmission"));
        list.add(new QuestionModel("What is the purpose of DHCP (Dynamic Host Configuration Protocol) in networking?",
                "To establish secure connections between two devices", "To automatically assign IP addresses to devices on a network", "To convert domain names into IP addresses", "To manage network routing tables", "To automatically assign IP addresses to devices on a network"));
        list.add(new QuestionModel("What is the difference between a modem and a router in networking?",
                "A modem provides wireless access to the network, while a router connects multiple local networks", "A modem connects a network to the internet, while a router connects multiple networks", "A modem supports higher network speeds than a router", "A modem provides stronger security than a router", "A modem connects a network to the internet, while a router connects multiple networks"));
        list.add(new QuestionModel("What is the purpose of ICMP (Internet Control Message Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To send error messages and control messages between network devices", "To establish VPN connections", "To send error messages and control messages between network devices"));
        list.add(new QuestionModel("What is the difference between a public IP address and a private IP address?",
                "A public IP address is assigned by the ISP, while a private IP address is assigned by the device manufacturer", "A public IP address provides stronger security than a private IP address", "A public IP address is used for wired networks, while a private IP address is used for wireless networks", "A public IP address is unique and routable on the internet, while a private IP address is used within a local network", "A public IP address is unique and routable on the internet, while a private IP address is used within a local network"));
        list.add(new QuestionModel("What is the purpose of VLANs (Virtual Local Area Networks) in networking?",
                "To provide wireless access to the network", "To encrypt network traffic", "To manage network routing tables", "To logically divide a physical network into multiple virtual networks", "To logically divide a physical network into multiple virtual networks"));
        list.add(new QuestionModel("What is the difference between half-duplex and full-duplex communication?",
                "Half-duplex communication is faster than full-duplex communication", "Half-duplex communication is used for wireless networks, while full-duplex communication is used for wired networks", "Full-duplex communication requires a higher bandwidth than half-duplex communication", "In half-duplex communication, data can be transmitted in only one direction at a time, while in full-duplex communication, data can be transmitted simultaneously in both directions", "In half-duplex communication, data can be transmitted in only one direction at a time, while in full-duplex communication, data can be transmitted simultaneously in both directions"));

    }

    private void setThree(){
        list.add(new QuestionModel("What is the purpose of a MAC address in networking?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To uniquely identify a device on a network", "To encrypt network traffic", "To uniquely identify a device on a network"));
        list.add(new QuestionModel("What is the function of a network gateway in networking?",
                "To filter network traffic", "To provide wireless access to the network", "To connect multiple local networks", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the purpose of DHCP (Dynamic Host Configuration Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To automatically assign IP addresses to devices on a network", "To establish VPN connections", "To automatically assign IP addresses to devices on a network"));
        list.add(new QuestionModel("What is the difference between a modem and a router in networking?",
                "A modem provides wireless access to the network, while a router connects multiple local networks", "A modem connects a network to the internet, while a router connects multiple networks", "A modem supports higher network speeds than a router", "A modem provides stronger security than a router", "A modem connects a network to the internet, while a router connects multiple networks"));
        list.add(new QuestionModel("What is the purpose of ICMP (Internet Control Message Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To send error messages and control messages between network devices", "To establish VPN connections", "To send error messages and control messages between network devices"));
        list.add(new QuestionModel("What is the difference between a public IP address and a private IP address?",
                "A public IP address is assigned by the ISP, while a private IP address is assigned by the device manufacturer", "A public IP address provides stronger security than a private IP address", "A public IP address is used for wired networks, while a private IP address is used for wireless networks", "A public IP address is unique and routable on the internet, while a private IP address is used within a local network", "A public IP address is unique and routable on the internet, while a private IP address is used within a local network"));
        list.add(new QuestionModel("What is the purpose of VLANs (Virtual Local Area Networks) in networking?",
                "To provide wireless access to the network", "To encrypt network traffic", "To manage network routing tables", "To logically divide a physical network into multiple virtual networks", "To logically divide a physical network into multiple virtual networks"));
        list.add(new QuestionModel("What is the difference between half-duplex and full-duplex communication?",
                "Half-duplex communication is faster than full-duplex communication", "Half-duplex communication is used for wireless networks, while full-duplex communication is used for wired networks", "Full-duplex communication requires a higher bandwidth than half-duplex communication", "In half-duplex communication, data can be transmitted in only one direction at a time, while in full-duplex communication, data can be transmitted simultaneously in both directions", "In half-duplex communication, data can be transmitted in only one direction at a time, while in full-duplex communication, data can be transmitted simultaneously in both directions"));
        list.add(new QuestionModel("What is the purpose of NAT (Network Address Translation) in networking?",
                "To encrypt network traffic", "To allow multiple devices to share a single public IP address", "To block unauthorized access to the network", "To route network traffic between different networks", "To allow multiple devices to share a single public IP address"));
        list.add(new QuestionModel("What is the difference between a hub and a switch in networking?",
                "A hub supports higher network speeds than a switch", "A hub provides wireless access to the network, while a switch connects multiple local networks", "A hub provides stronger security than a switch", "A hub operates at the physical layer and broadcasts data to all connected devices, while a switch operates at the data link layer and selectively forwards data to the intended recipient", "A hub operates at the physical layer and broadcasts data to all connected devices, while a switch operates at the data link layer and selectively forwards data to the intended recipient"));


    }

    private void setFour(){
        list.add(new QuestionModel("What is the purpose of a firewall in networking?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To protect a network from unauthorized access and external threats", "To filter network traffic based on port numbers", "To protect a network from unauthorized access and external threats"));
        list.add(new QuestionModel("What is the function of ARP (Address Resolution Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To map an IP address to a MAC address", "To establish VPN connections", "To map an IP address to a MAC address"));
        list.add(new QuestionModel("What is the purpose of a network switch in networking?",
                "To filter network traffic", "To provide wireless access to the network", "To connect multiple devices within a local network and facilitate data transmission", "To establish VPN connections", "To connect multiple devices within a local network and facilitate data transmission"));
        list.add(new QuestionModel("What is the difference between TCP (Transmission Control Protocol) and UDP (User Datagram Protocol)?",
                "TCP is faster than UDP for real-time applications", "UDP provides stronger encryption than TCP", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order", "TCP is used for video streaming, while UDP is used for web browsing", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order"));
        list.add(new QuestionModel("What is the function of a router in networking?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the purpose of DNS (Domain Name System) in networking?",
                "To secure network communications", "To convert domain names into IP addresses", "To manage network routing tables", "To establish VPN connections", "To convert domain names into IP addresses"));
        list.add(new QuestionModel("What is the purpose of DHCP (Dynamic Host Configuration Protocol) in networking?",
                "To establish secure connections between two devices", "To automatically assign IP addresses to devices on a network", "To convert domain names into IP addresses", "To manage network routing tables", "To automatically assign IP addresses to devices on a network"));
        list.add(new QuestionModel("What is the difference between a public IP address and a private IP address?",
                "A public IP address is assigned by the ISP, while a private IP address is assigned by the device manufacturer", "A public IP address provides stronger security than a private IP address", "A public IP address is used for wired networks, while a private IP address is used for wireless networks", "A public IP address is unique and routable on the internet, while a private IP address is used within a local network", "A public IP address is unique and routable on the internet, while a private IP address is used within a local network"));
        list.add(new QuestionModel("What is the purpose of VLANs (Virtual Local Area Networks) in networking?",
                "To provide wireless access to the network", "To encrypt network traffic", "To manage network routing tables", "To logically divide a physical network into multiple virtual networks", "To logically divide a physical network into multiple virtual networks"));
        list.add(new QuestionModel("What is the difference between half-duplex and full-duplex communication?",
                "Half-duplex communication is faster than full-duplex communication", "Half-duplex communication is used for wireless networks, while full-duplex communication is used for wired networks", "Full-duplex communication requires a higher bandwidth than half-duplex communication", "In half-duplex communication, data can be transmitted in only one direction at a time, while in full-duplex communication, data can be transmitted simultaneously in both directions", "In half-duplex communication, data can be transmitted in only one direction at a time, while in full-duplex communication, data can be transmitted simultaneously in both directions"));

    }
    private void setFive(){
        list.add(new QuestionModel("What is the purpose of a default gateway in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To provide wireless access to the network", "To connect a local network to other networks", "To connect a local network to other networks"));
        list.add(new QuestionModel("What is the function of DNS (Domain Name System) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To convert domain names into IP addresses", "To establish VPN connections", "To convert domain names into IP addresses"));
        list.add(new QuestionModel("What is the difference between a hub and a switch in networking?",
                "A hub supports higher network speeds than a switch", "A hub provides wireless access to the network, while a switch connects multiple local networks", "A hub provides stronger security than a switch", "A hub operates at the physical layer and broadcasts data to all connected devices, while a switch operates at the data link layer and selectively forwards data to the intended recipient", "A hub operates at the physical layer and broadcasts data to all connected devices, while a switch operates at the data link layer and selectively forwards data to the intended recipient"));
        list.add(new QuestionModel("What is the purpose of NAT (Network Address Translation) in networking?",
                "To encrypt network traffic", "To allow multiple devices to share a single public IP address", "To block unauthorized access to the network", "To route network traffic between different networks", "To allow multiple devices to share a single public IP address"));
        list.add(new QuestionModel("What is the function of ARP (Address Resolution Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To map an IP address to a MAC address", "To establish VPN connections", "To map an IP address to a MAC address"));
        list.add(new QuestionModel("What is the purpose of a network firewall?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To protect a network from unauthorized access and external threats", "To filter network traffic based on port numbers", "To protect a network from unauthorized access and external threats"));
        list.add(new QuestionModel("What is the purpose of a network router?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the difference between TCP (Transmission Control Protocol) and UDP (User Datagram Protocol)?",
                "TCP is faster than UDP for real-time applications", "UDP provides stronger encryption than TCP", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order", "TCP is used for video streaming, while UDP is used for web browsing", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order"));
        list.add(new QuestionModel("What is the purpose of DHCP (Dynamic Host Configuration Protocol) in networking?",
                "To establish secure connections between two devices", "To automatically assign IP addresses to devices on a network", "To convert domain names into IP addresses", "To manage network routing tables", "To automatically assign IP addresses to devices on a network"));
        list.add(new QuestionModel("What is the purpose of VLANs (Virtual Local Area Networks) in networking?",
                "To provide wireless access to the network", "To encrypt network traffic", "To manage network routing tables", "To logically divide a physical network into multiple virtual networks", "To logically divide a physical network into multiple virtual networks"));

    }
    private void setSix(){
        list.add(new QuestionModel("What is the purpose of a network gateway?",
                "To encrypt network traffic", "To manage network routing tables", "To provide wireless access to the network", "To connect a local network to other networks", "To connect a local network to other networks"));
        list.add(new QuestionModel("What is the function of DNS (Domain Name System) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To convert domain names into IP addresses", "To establish VPN connections", "To convert domain names into IP addresses"));
        list.add(new QuestionModel("What is the difference between a hub and a switch in networking?",
                "A hub supports higher network speeds than a switch", "A hub provides wireless access to the network, while a switch connects multiple local networks", "A hub provides stronger security than a switch", "A hub operates at the physical layer and broadcasts data to all connected devices, while a switch operates at the data link layer and selectively forwards data to the intended recipient", "A hub operates at the physical layer and broadcasts data to all connected devices, while a switch operates at the data link layer and selectively forwards data to the intended recipient"));
        list.add(new QuestionModel("What is the purpose of NAT (Network Address Translation) in networking?",
                "To encrypt network traffic", "To allow multiple devices to share a single public IP address", "To block unauthorized access to the network", "To route network traffic between different networks", "To allow multiple devices to share a single public IP address"));
        list.add(new QuestionModel("What is the function of ARP (Address Resolution Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To map an IP address to a MAC address", "To establish VPN connections", "To map an IP address to a MAC address"));
        list.add(new QuestionModel("What is the purpose of a network firewall?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To protect a network from unauthorized access and external threats", "To filter network traffic based on port numbers", "To protect a network from unauthorized access and external threats"));
        list.add(new QuestionModel("What is the purpose of a network router?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the difference between TCP (Transmission Control Protocol) and UDP (User Datagram Protocol)?",
                "TCP is faster than UDP for real-time applications", "UDP provides stronger encryption than TCP", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order", "TCP is used for video streaming, while UDP is used for web browsing", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order"));
        list.add(new QuestionModel("What is the purpose of DHCP (Dynamic Host Configuration Protocol) in networking?",
                "To establish secure connections between two devices", "To automatically assign IP addresses to devices on a network", "To convert domain names into IP addresses", "To manage network routing tables", "To automatically assign IP addresses to devices on a network"));
        list.add(new QuestionModel("What is the purpose of VLANs (Virtual Local Area Networks) in networking?",
                "To provide wireless access to the network", "To encrypt network traffic", "To manage network routing tables", "To logically divide a physical network into multiple virtual networks", "To logically divide a physical network into multiple virtual networks"));

    }
    private  void setSeven(){
        list.add(new QuestionModel("What is the purpose of a network proxy?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To filter network traffic based on port numbers", "To act as an intermediary between a client and a server", "To act as an intermediary between a client and a server"));
        list.add(new QuestionModel("What is the function of ICMP (Internet Control Message Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To convert domain names into IP addresses", "To handle error messages and diagnostic functions in IP networks", "To handle error messages and diagnostic functions in IP networks"));
        list.add(new QuestionModel("What is the purpose of a network load balancer?",
                "To establish secure connections between two devices", "To distribute network traffic across multiple servers to optimize performance and reliability", "To manage network routing tables", "To convert domain names into IP addresses", "To distribute network traffic across multiple servers to optimize performance and reliability"));
        list.add(new QuestionModel("What is the difference between IPv4 and IPv6?",
                "IPv4 provides stronger encryption than IPv6", "IPv4 supports a larger address space than IPv6", "IPv4 uses 128-bit addresses, while IPv6 uses 32-bit addresses", "IPv4 is used for wired networks, while IPv6 is used for wireless networks", "IPv4 supports a larger address space than IPv6"));
        list.add(new QuestionModel("What is the purpose of a network switch?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the function of BGP (Border Gateway Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To convert domain names into IP addresses", "To enable communication between different autonomous systems on the internet", "To enable communication between different autonomous systems on the internet"));
        list.add(new QuestionModel("What is the purpose of subnetting in networking?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To divide a large network into smaller subnetworks for improved performance and management", "To manage network routing tables", "To divide a large network into smaller subnetworks for improved performance and management"));
        list.add(new QuestionModel("What is the difference between a MAC address and an IP address?",
                "A MAC address is used for wireless networks, while an IP address is used for wired networks", "A MAC address is a physical address assigned to a network interface card, while an IP address is a logical address assigned to a device on a network", "A MAC address is shorter than an IP address", "A MAC address is used for network routing, while an IP address is used for data transmission", "A MAC address is a physical address assigned to a network interface card, while an IP address is a logical address assigned to a device on a network"));
        list.add(new QuestionModel("What is the purpose of QoS (Quality of Service) in networking?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To manage network routing tables", "To prioritize network traffic and ensure reliable performance for specific applications or services", "To prioritize network traffic and ensure reliable performance for specific applications or services"));
        list.add(new QuestionModel("What is the purpose of a network gateway?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));

    }
    private void setEight(){
        list.add(new QuestionModel("What is the function of DHCP (Dynamic Host Configuration Protocol) in networking?",
                "To encrypt network traffic", "To automatically assign IP addresses to devices on a network", "To convert domain names into IP addresses", "To manage network routing tables", "To automatically assign IP addresses to devices on a network"));
        list.add(new QuestionModel("What is the purpose of VLANs (Virtual Local Area Networks) in networking?",
                "To provide wireless access to the network", "To encrypt network traffic", "To manage network routing tables", "To logically divide a physical network into multiple virtual networks", "To logically divide a physical network into multiple virtual networks"));
        list.add(new QuestionModel("What is the purpose of a network proxy?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To filter network traffic based on port numbers", "To act as an intermediary between a client and a server", "To act as an intermediary between a client and a server"));
        list.add(new QuestionModel("What is the function of ICMP (Internet Control Message Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To convert domain names into IP addresses", "To handle error messages and diagnostic functions in IP networks", "To handle error messages and diagnostic functions in IP networks"));
        list.add(new QuestionModel("What is the purpose of a network load balancer?",
                "To establish secure connections between two devices", "To distribute network traffic across multiple servers to optimize performance and reliability", "To manage network routing tables", "To convert domain names into IP addresses", "To distribute network traffic across multiple servers to optimize performance and reliability"));
        list.add(new QuestionModel("What is the difference between IPv4 and IPv6?",
                "IPv4 provides stronger encryption than IPv6", "IPv4 supports a larger address space than IPv6", "IPv4 uses 128-bit addresses, while IPv6 uses 32-bit addresses", "IPv4 is used for wired networks, while IPv6 is used for wireless networks", "IPv4 supports a larger address space than IPv6"));
        list.add(new QuestionModel("What is the purpose of a network switch?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the function of BGP (Border Gateway Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To convert domain names into IP addresses", "To enable communication between different autonomous systems on the internet", "To enable communication between different autonomous systems on the internet"));
        list.add(new QuestionModel("What is the purpose of subnetting in networking?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To divide a large network into smaller subnetworks for improved performance and management", "To manage network routing tables", "To divide a large network into smaller subnetworks for improved performance and management"));
        list.add(new QuestionModel("What is the difference between a MAC address and an IP address?",
                "A MAC address is used for wireless networks, while an IP address is used for wired networks", "A MAC address is a physical address assigned to a network interface card, while an IP address is a logical address assigned to a device on a network", "A MAC address is shorter than an IP address", "A MAC address is used for network routing, while an IP address is used for data transmission", "A MAC address is a physical address assigned to a network interface card, while an IP address is a logical address assigned to a device on a network"));
        list.add(new QuestionModel("What is the purpose of QoS (Quality of Service) in networking?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To manage network routing tables", "To prioritize network traffic and ensure reliable performance for specific applications or services", "To prioritize network traffic and ensure reliable performance for specific applications or services"));
        list.add(new QuestionModel("What is the purpose of a network gateway?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));

    }
    private void setNine(){
        list.add(new QuestionModel("What is the purpose of NAT (Network Address Translation) in networking?",
                "To encrypt network traffic", "To allow multiple devices to share a single public IP address", "To block unauthorized access to the network", "To route network traffic between different networks", "To allow multiple devices to share a single public IP address"));
        list.add(new QuestionModel("What is the function of ARP (Address Resolution Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To map an IP address to a MAC address", "To establish VPN connections", "To map an IP address to a MAC address"));
        list.add(new QuestionModel("What is the purpose of a network firewall?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To protect a network from unauthorized access and external threats", "To filter network traffic based on port numbers", "To protect a network from unauthorized access and external threats"));
        list.add(new QuestionModel("What is the purpose of a network router?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the difference between TCP (Transmission Control Protocol) and UDP (User Datagram Protocol)?",
                "TCP is faster than UDP for real-time applications", "UDP provides stronger encryption than TCP", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order", "TCP is used for video streaming, while UDP is used for web browsing", "TCP provides reliable and ordered delivery of data, while UDP does not guarantee delivery or order"));
        list.add(new QuestionModel("What is the purpose of DHCP (Dynamic Host Configuration Protocol) in networking?",
                "To establish secure connections between two devices", "To automatically assign IP addresses to devices on a network", "To convert domain names into IP addresses", "To manage network routing tables", "To automatically assign IP addresses to devices on a network"));
        list.add(new QuestionModel("What is the purpose of VLANs (Virtual Local Area Networks) in networking?",
                "To provide wireless access to the network", "To encrypt network traffic", "To manage network routing tables", "To logically divide a physical network into multiple virtual networks", "To logically divide a physical network into multiple virtual networks"));
        list.add(new QuestionModel("What is the function of a network proxy?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To filter network traffic based on port numbers", "To act as an intermediary between a client and a server", "To act as an intermediary between a client and a server"));
        list.add(new QuestionModel("What is the function of ICMP (Internet Control Message Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To convert domain names into IP addresses", "To handle error messages and diagnostic functions in IP networks", "To handle error messages and diagnostic functions in IP networks"));
        list.add(new QuestionModel("What is the purpose of a network load balancer?",
                "To establish secure connections between two devices", "To distribute network traffic across multiple servers to optimize performance and reliability", "To manage network routing tables", "To convert domain names into IP addresses", "To distribute network traffic across multiple servers to optimize performance and reliability"));

    }
    private void setTen(){
        list.add(new QuestionModel("What is the difference between IPv4 and IPv6?",
                "IPv4 provides stronger encryption than IPv6", "IPv4 supports a larger address space than IPv6", "IPv4 uses 128-bit addresses, while IPv6 uses 32-bit addresses", "IPv4 is used for wired networks, while IPv6 is used for wireless networks", "IPv4 supports a larger address space than IPv6"));
        list.add(new QuestionModel("What is the purpose of a network switch?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the function of BGP (Border Gateway Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To convert domain names into IP addresses", "To enable communication between different autonomous systems on the internet", "To enable communication between different autonomous systems on the internet"));
        list.add(new QuestionModel("What is the purpose of subnetting in networking?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To divide a large network into smaller subnetworks for improved performance and management", "To manage network routing tables", "To divide a large network into smaller subnetworks for improved performance and management"));
        list.add(new QuestionModel("What is the difference between a MAC address and an IP address?",
                "A MAC address is used for wireless networks, while an IP address is used for wired networks", "A MAC address is a physical address assigned to a network interface card, while an IP address is a logical address assigned to a device on a network", "A MAC address is shorter than an IP address", "A MAC address is used for network routing, while an IP address is used for data transmission", "A MAC address is a physical address assigned to a network interface card, while an IP address is a logical address assigned to a device on a network"));
        list.add(new QuestionModel("What is the purpose of QoS (Quality of Service) in networking?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To manage network routing tables", "To prioritize network traffic and ensure reliable performance for specific applications or services", "To prioritize network traffic and ensure reliable performance for specific applications or services"));
        list.add(new QuestionModel("What is the purpose of a network gateway?",
                "To provide wireless access to the network", "To connect multiple local networks", "To filter network traffic", "To establish VPN connections", "To connect multiple local networks"));
        list.add(new QuestionModel("What is the purpose of NAT (Network Address Translation) in networking?",
                "To encrypt network traffic", "To allow multiple devices to share a single public IP address", "To block unauthorized access to the network", "To route network traffic between different networks", "To allow multiple devices to share a single public IP address"));
        list.add(new QuestionModel("What is the function of ARP (Address Resolution Protocol) in networking?",
                "To encrypt network traffic", "To manage network routing tables", "To map an IP address to a MAC address", "To establish VPN connections", "To map an IP address to a MAC address"));
        list.add(new QuestionModel("What is the purpose of a network firewall?",
                "To establish secure connections between two devices", "To convert domain names into IP addresses", "To protect a network from unauthorized access and external threats", "To filter network traffic based on port numbers", "To protect a network from unauthorized access and external threats"));

    }
}
